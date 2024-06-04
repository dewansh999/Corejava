import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        int[][] A = new int[3][3];

        try (Scanner sk = new Scanner(System.in)) {
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) { // Corrected the loop termination condition
                    System.out.println("Enter Element at Index " + i + ", " + j + ": ");
                    A[i][j] = sk.nextInt();
                }
            }

            System.out.println("Output of the array:");
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    System.out.print("\t" + A[i][j]);
                }
                System.out.println();
            }
        }
    }
}
