public class StarPyramidPattern {
    public static void main(String[] args) {
        // Number of rows for the pyramid
        int rows = 5;

        // Outer loop for each row
        for (int i = 0; i < rows; i++) {
            // Inner loop for leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Inner loop for printing stars
            for (int k = 0; k < (rows - i) * 2 - 1; k++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

