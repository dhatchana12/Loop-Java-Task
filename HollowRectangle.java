public class HollowRectangle {
    public static void main(String[] args) {
        // Dimensions of the rectangle
        int rows = 5;
        int columns = 10;

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop for each column
            for (int j = 1; j <= columns; j++) {
                // Print '*' on the borders
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
