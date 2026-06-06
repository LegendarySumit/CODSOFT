import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int MAX_ATTEMPTS = 10;
    private static final Scanner scanner = new Scanner(System.in);
    
    private int totalScore = 0;
    private int roundsPlayed = 0;
    
    public static void main(String[] args) {
        NumberGame game = new NumberGame();
        game.displayWelcome();
        game.playGame();
        game.displayFinalScore();
    }
    
    private void displayWelcome() {
        System.out.println("\n WELCOME TO NUMBER GUESSING GAME");
        System.out.println("\n HOW TO PLAY:");
        System.out.println("  1. A random number between " + MIN_NUMBER + " and " + MAX_NUMBER + " will be generated");
        System.out.println("  2. You have " + MAX_ATTEMPTS + " attempts to guess the number");
        System.out.println("  3. You'll receive feedback: Too High, Too Low, or Correct!");
        System.out.println("  4. Play multiple rounds and accumulate your score");
        System.out.println("  5. Your score = (MAX_ATTEMPTS - Attempts Used)\n");
    }
    
    private void playGame() {
        boolean playAgain = true;
        
        while (playAgain) {
            playSingleRound();
            playAgain = askPlayAgain();
        }
    }
    
    private void playSingleRound() {
        roundsPlayed++;
        System.out.println("\n ROUND " + roundsPlayed);
        
        int secretNumber = generateRandomNumber();
        int attempts = 0;
        int userGuess = -1;
        
        System.out.println("\n I'm thinking of a number between " + MIN_NUMBER + " and " + MAX_NUMBER);
        System.out.println(" You have " + MAX_ATTEMPTS + " attempts. Good luck!\n");
        
        while (attempts < MAX_ATTEMPTS && userGuess != secretNumber) {
            try {
                System.out.print(" Attempt " + (attempts + 1) + "/" + MAX_ATTEMPTS + " Enter your guess: ");
                userGuess = getUserInput();
                
                if (userGuess < MIN_NUMBER || userGuess > MAX_NUMBER) {
                    System.out.println(" Please enter a number between " + MIN_NUMBER + " and " + MAX_NUMBER + "!\n");
                    continue;
                }
                
                attempts++;
                
                if (userGuess == secretNumber) {
                    displayCorrectAnswer(attempts, secretNumber);
                    int roundScore = MAX_ATTEMPTS - attempts + 1;
                    totalScore += roundScore;
                } else if (userGuess < secretNumber) {
                    System.out.println(" Too low! Try a higher number.\n");
                } else {
                    System.out.println(" Too high! Try a lower number.\n");
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.\n");
            }
        }
        
        if (userGuess != secretNumber) {
            displayGameOver(secretNumber);
        }
    }
    
    private int generateRandomNumber() {
        return new Random().nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }
    
    private int getUserInput() throws NumberFormatException {
        String input = scanner.nextLine().trim();
        return Integer.parseInt(input);
    }
    
    private void displayCorrectAnswer(int attempts, int secretNumber) {
        System.out.println("\nCORRECT! The number was " + secretNumber);
        System.out.println("You guessed it in " + attempts + " attempt(s)!");
        int roundScore = MAX_ATTEMPTS - attempts + 1;
        System.out.println("Round Score: " + roundScore + " points\n");
    }
    
    private void displayGameOver(int secretNumber) {
        System.out.println("\nGAME OVER! You've used all " + MAX_ATTEMPTS + " attempts!");
        System.out.println("The correct number was: " + secretNumber + "\n");
    }
    
    private boolean askPlayAgain() {
        System.out.print("Would you like to play another round? (yes/no): ");
        String response = scanner.nextLine().trim().toLowerCase();
        return response.equals("yes") || response.equals("y");
    }
    
    private void displayFinalScore() {
        System.out.println("\nGAME STATISTICS");
        System.out.println("Total Rounds Played: " + roundsPlayed);
        System.out.println("Total Score: " + totalScore + " points");
        if (roundsPlayed > 0) {
            double averageScore = (double) totalScore / roundsPlayed;
            System.out.println("Average Score per Round: " + String.format("%.2f", averageScore));
        }
        System.out.println("\nThanks for playing!\n");
    }
}