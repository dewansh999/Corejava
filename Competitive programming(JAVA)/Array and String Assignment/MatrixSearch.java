public class MatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
                { 15, 23, 31, 39 },
                { 18, 26, 36, 43 },
                { 25, 28, 37, 48 },
                { 30, 34, 39, 50 }
        };
        int target = 37;

        // Initialize the matrix dimensions
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start from the top-right corner
        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            int current = matrix[row][col];
            if (current == target) {
                System.out.println("The element Found at the position in the matrix is: " + row + ", " + col);
                return;
            } else if (current > target) {
                // Move left in the current row
                col--;
            } else {
                // Move down to the next row
                row++;
            }
        }

        System.out.println("The element was not found in the matrix.");
    }
}
