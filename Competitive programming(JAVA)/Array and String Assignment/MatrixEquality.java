import java.util.Scanner;

public class MatrixEquality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Rows and Columns of the 1st matrix: ");
        int rows1 = input.nextInt();
        int cols1 = input.nextInt();

        System.out.print("Input Rows and Columns of the 2nd matrix: ");
        int rows2 = input.nextInt();
        int cols2 = input.nextInt();
        input.close();
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Matrices have different dimensions. They cannot be compared.");
            return;
        }

        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];

        System.out.println("Input elements in the first matrix: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("element - [" + i + "],[" + j + "]: ");
                matrix1[i][j] = input.nextInt();
            }
        }

        System.out.println("Input elements in the second matrix: ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("element - [" + i + "],[" + j + "]: ");
                matrix2[i][j] = input.nextInt();
            }
        }

        if (areMatricesEqual(matrix1, matrix2)) {
            System.out.println("The Matrices can be compared: \nTwo matrices are equal.");
        } else {
            System.out.println("The Matrices can be compared: \nTwo matrices are not equal.");
        }

        input.close();
    }

    public static boolean areMatricesEqual(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return false;
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
