// Define a function to find the sum of rows and columns of a matrix

import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        int size = 2; // Change this to the size of your matrix
        int[][] matrix = new int[size][size];
        int[] rowSum = new int[size];
        int[] colSum = new int[size];
        Scanner sk = new Scanner(System.in);

        // Input elements into the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // You can replace this part with your own input logic
                System.out.print("Enter element - [" + i + "],[" + j + "] : ");
                matrix[i][j] = sk.nextInt();
            }
            sk.close();

            // Calculate the sum of rows and columns
            for (int a = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    rowSum[a] += matrix[a][j];
                    colSum[j] += matrix[a][j];
                }
            }

            // Display the matrix
            System.out.println("The matrix is:");
            for (int b = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(matrix[b][j] + " ");
                }
                System.out.println();
            }

            // Display the sum of rows
            System.out.println("The sum of rows is:");
            for (int c = 0; i < size; i++) {
                System.out.print(rowSum[c] + " ");
            }
            System.out.println();

            // Display the sum of columns
            System.out.println("The sum of columns is:");
            for (int d = 0; i < size; i++) {
                System.out.print(colSum[d] + " ");
            }
            System.out.println();
        }
    }
}
