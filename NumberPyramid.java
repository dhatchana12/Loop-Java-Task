public class NumberPyramid {
    public static void main(String[] args) {
        // Number of rows for the pyramid
        int rows = 5;

        // Outer loop for each row
        for (int i = rows; i >= 1; i--) {
            // Calculate the number of elements in the current row
            int numberOfElements = (rows - i + 1) * 2 - 1;

            // Inner loop for printing numbers in each row
            for (int j = 1; j <= numberOfElements; j++) {
                System.out.print(i + "  ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
