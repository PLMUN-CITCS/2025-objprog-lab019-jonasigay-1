import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for input
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        
        // Validate input
        while (number < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
            System.out.print("Enter a non-negative integer: ");
            number = scanner.nextInt();
        }
        
        // Calculate factorial
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        // Print the result
        System.out.println("The factorial of " + number + " is: " + factorial);
        
        scanner.close();
    }
}
