import java.util.Scanner;

public class StudentGradeCalculator {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        StudentGradeCalculator calculator = new StudentGradeCalculator();
        calculator.run();
    }
    
    private void run() {
        System.out.println("\nSTUDENT GRADE CALCULATOR\n");
        
        System.out.print("Enter number of subjects: ");
        int numSubjects = getValidInput();
        
        int[] marks = new int[numSubjects];
        
        System.out.println("\nEnter marks for each subject (out of 100):\n");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + " marks: ");
            marks[i] = getValidMarks();
        }
        
        int totalMarks = calculateTotalMarks(marks);
        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);
        char grade = assignGrade(averagePercentage);
        
        displayResults(totalMarks, averagePercentage, grade);
    }
    
    private int getValidInput() {
        while (true) {
            try {
                int input = Integer.parseInt(scanner.nextLine().trim());
                if (input > 0) {
                    return input;
                }
                System.out.print("Please enter a positive number: ");
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Enter a valid number: ");
            }
        }
    }
    
    private int getValidMarks() {
        while (true) {
            try {
                int marks = Integer.parseInt(scanner.nextLine().trim());
                if (marks >= 0 && marks <= 100) {
                    return marks;
                }
                System.out.print("Marks must be between 0 and 100: ");
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Enter a valid number: ");
            }
        }
    }
    
    private int calculateTotalMarks(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    
    private double calculateAveragePercentage(int total, int numSubjects) {
        return (double) total / numSubjects;
    }
    
    private char assignGrade(double percentage) {
        if (percentage >= 90) return 'A';
        if (percentage >= 80) return 'B';
        if (percentage >= 70) return 'C';
        if (percentage >= 60) return 'D';
        return 'F';
    }
    
    private void displayResults(int totalMarks, double averagePercentage, char grade) {
        System.out.println("\nRESULTS\n");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}
