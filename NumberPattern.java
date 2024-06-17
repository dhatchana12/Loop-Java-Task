public class NumberPattern {
    public static void main(String[] args) {
        // Number of rows for the pattern
        int rows = 5;

        // Outer loop for each row
        for (int i = rows; i >= 1; i--) {
            // Inner loop for printing numbers in each row
            for (int j = 1; j <= 5; j++) { // 5 is the number of columns in the pattern
                System.out.print(i + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
