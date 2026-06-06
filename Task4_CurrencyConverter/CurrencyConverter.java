import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    private static final Scanner scanner = new Scanner(System.in);
    private Map<String, Double> exchangeRates;
    
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        converter.run();
    }
    
    private void run() {
        initializeExchangeRates();
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
            
            double convertedAmount = convertCurrency(baseCurrency, targetCurrency, amount);
            displayResult(amount, baseCurrency, convertedAmount, targetCurrency);
            
            System.out.print("\nConvert again? (yes/no): ");
            continueConverting = scanner.nextLine().trim().toLowerCase().startsWith("y");
        }
        
        System.out.println("\nThank you for using Currency Converter!");
    }
    
    private void initializeExchangeRates() {
        exchangeRates = new HashMap<>();
        
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.92);
        exchangeRates.put("GBP", 0.79);
        exchangeRates.put("INR", 83.12);
        exchangeRates.put("JPY", 149.50);
        exchangeRates.put("AUD", 1.53);
        exchangeRates.put("CAD", 1.36);
        exchangeRates.put("CHF", 0.88);
        exchangeRates.put("CNY", 7.24);
        exchangeRates.put("SGD", 1.35);
    }
    
    private void displayAvailableCurrencies() {
        System.out.println("Available Currencies:");
        int count = 0;
        for (String currency : exchangeRates.keySet()) {
            System.out.print(currency + " ");
            count++;
            if (count % 5 == 0) System.out.println();
        }
        System.out.println("\n");
    }
    
    private String getCurrencyInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim().toUpperCase();
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
        return exchangeRates.containsKey(currency);
    }
    
    private double convertCurrency(String from, String to, double amount) {
        double amountInUSD = amount / exchangeRates.get(from);
        return amountInUSD * exchangeRates.get(to);
    }
    
    private void displayResult(double amount, String fromCurrency, double convertedAmount, String toCurrency) {
        System.out.println("\nCONVERSION RESULT\n");
        System.out.printf("%.2f %s = %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);
    }
}
