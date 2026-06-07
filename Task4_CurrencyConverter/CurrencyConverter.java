import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyConverter {
    private static final java.util.Scanner scanner = new java.util.Scanner(System.in);
    private static final String BASE_URL = "https://open.er-api.com/v6/latest/";
    private static final Set<String> SUPPORTED_CURRENCIES = new HashSet<>(Arrays.asList(
            "USD", "EUR", "GBP", "INR", "JPY", "AUD", "CAD", "CHF", "CNY", "SGD"
    ));
    private static final HttpClient HTTP_CLIENT = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        converter.run();
    }

    private void run() {
        boolean continueConverting = true;

        while (continueConverting) {
            System.out.println("\nCURRENCY CONVERTER\n");
            displayAvailableCurrencies();

            String baseCurrency = getCurrencyInput("Enter base currency (e.g., USD): ");
            String targetCurrency = getCurrencyInput("Enter target currency (e.g., EUR): ");

            if (!isValidCurrency(baseCurrency) || !isValidCurrency(targetCurrency)) {
                System.out.println("\nInvalid currency code. Please try again.");
                continue;
            }

            System.out.print("\nEnter amount to convert: ");
            double amount = getValidAmount();

            try {
                double convertedAmount = convertCurrency(baseCurrency, targetCurrency, amount);
                displayResult(amount, baseCurrency, convertedAmount, targetCurrency);
            } catch (IOException | InterruptedException e) {
                System.out.println("\nWarning: Error fetching live exchange rates. Please try again later.");
                System.out.println("   Cause: " + e.getMessage());
            } catch (IllegalStateException e) {
                System.out.println("\nWarning: Live exchange rate data was unavailable for " + targetCurrency + ".");
            }

            System.out.print("\nConvert again? (yes/no): ");
            continueConverting = scanner.nextLine().trim().toLowerCase(Locale.ROOT).startsWith("y");
        }

        System.out.println("\nThank you for using Currency Converter!");
    }

    private void displayAvailableCurrencies() {
        System.out.println("Available Currencies:");
        int count = 0;
        for (String currency : SUPPORTED_CURRENCIES) {
            System.out.print(currency + " ");
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        if (count % 5 != 0) {
            System.out.println();
        }
        System.out.println();
    }

    private String getCurrencyInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim().toUpperCase(Locale.ROOT);
    }

    private double getValidAmount() {
        try {
            double amount = Double.parseDouble(scanner.nextLine().trim());
            if (amount < 0) {
                System.out.print("Amount must be positive. Enter again: ");
                return getValidAmount();
            }
            return amount;
        } catch (NumberFormatException e) {
            System.out.print("Invalid amount. Enter a valid number: ");
            return getValidAmount();
        }
    }

    private boolean isValidCurrency(String currency) {
        return SUPPORTED_CURRENCIES.contains(currency);
    }

    private double convertCurrency(String from, String to, double amount) throws IOException, InterruptedException {
        if (from.equals(to)) {
            return amount;
        }

        String responseBody = fetchLiveRates(from);
        double targetRate = extractTargetRate(responseBody, to);
        return amount * targetRate;
    }

    private String fetchLiveRates(String baseCurrency) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + baseCurrency))
                .timeout(Duration.ofSeconds(15))
                .GET()
                .build();

        HttpResponse<String> response = HTTP_CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new IOException("HTTP " + response.statusCode());
        }

        return response.body();
    }

    private double extractTargetRate(String responseBody, String targetCurrency) {
        Pattern ratesPattern = Pattern.compile("\\\"rates\\\"\\s*:\\s*\\{([^}]*)\\}");
        Matcher ratesMatcher = ratesPattern.matcher(responseBody);
        if (!ratesMatcher.find()) {
            throw new IllegalStateException("Rates object not found in API response");
        }

        String ratesSection = ratesMatcher.group(1);
        Pattern targetPattern = Pattern.compile("\\\"" + Pattern.quote(targetCurrency) + "\\\"\\s*:\\s*([0-9]+(?:\\.[0-9]+)?)");
        Matcher targetMatcher = targetPattern.matcher(ratesSection);
        if (!targetMatcher.find()) {
            throw new IllegalStateException("Target currency rate not found");
        }

        return Double.parseDouble(targetMatcher.group(1));
    }

    private void displayResult(double amount, String fromCurrency, double convertedAmount, String toCurrency) {
        System.out.println("\nCONVERSION RESULT\n");
        System.out.printf(Locale.ROOT, "%.2f %s = %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
    }
}
