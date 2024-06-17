import java.util.Scanner;

public class aNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter 5 numbers
        System.out.println("Enter five numbers:");
        
        // Initialize variables to store the sum and average
        double sum = 0;
        double average = 0;
        
        // Read 5 numbers from the user
        for (int i = 0; i < 5; i++) {
            double number = scanner.nextDouble();
            sum += number;
        }
        
        // Calculate the average
        average = sum / 5;
        
        // Print the sum and average
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
        
        // Close the scanner
        scanner.close();
    }
}

