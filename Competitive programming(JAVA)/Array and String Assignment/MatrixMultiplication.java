import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the rows and columns of the first matrix: ");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();

        System.out.print("Input the rows and columns of the second matrix: ");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        scanner.close();
        if (cols1 != rows2) {
            System.out.println(
                    "Matrix multiplication is not possible. The number of columns in the first matrix must be equal to the number of rows in the second matrix.");
        } else {
            int[][] matrix1 = new int[rows1][cols1];
            int[][] matrix2 = new int[rows2][cols2];

            System.out.println("Input elements in the first matrix:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    System.out.print("element - [" + i + "],[" + j + "] : ");
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Input elements in the second matrix:");
            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < cols2; j++) {
                    System.out.print("element - [" + i + "],[" + j + "] : ");
                    matrix2[i][j] = scanner.nextInt();
                }
            }

            int[][] result = multiplyMatrices(matrix1, matrix2);

            System.out.println("Result of matrix multiplication:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                int sum = 0;
                for (int k = 0; k < cols1; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }
}
