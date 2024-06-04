public class Sumofcolumn {
  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    int rows = matrix.length;
    int cols = matrix[0].length;

    int[] columnSum = new int[cols];

    // Calculate column-wise sum
    for (int j = 0; j < cols; j++) {
      for (int i = 0; i < rows; i++) {
        columnSum[j] += matrix[i][j];
      }
    }

    // Print column-wise sum
    System.out.println("Column-wise sum:");
    for (int j = 0; j < cols; j++) {
      System.out.println("Column " + (j + 1) + ": " + columnSum[j]);
    }
  }
}
