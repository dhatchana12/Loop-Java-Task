public class InvertedHalfPyramidNumbers {
    public static void main(String[] args) {
        // Number of rows for the pyramid
        int rows = 5;

        // Outer loop for each row
        for (int i = rows; i >= 1; i--) {
            // Inner loop for printing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
