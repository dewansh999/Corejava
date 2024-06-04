// Java program to find the transpose of a matrix

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Input the number of columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Input elements in the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose the matrix
        int[][] transpose = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        // The transpose is obtained by swapping rows with columns, and it's printed as
        // the final output.
        System.out.println("The transpose of the matrix is:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
