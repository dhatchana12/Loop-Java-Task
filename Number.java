public class Number {
    public static void main(String[] args) {
        // Number of rows for the pyramid
        int rows = 7;

        // Variable to store the current number to be printed
        int number = 1;

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

