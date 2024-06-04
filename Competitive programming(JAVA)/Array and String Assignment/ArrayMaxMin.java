import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to input the number of elements in the array
        System.out.print("Input the number of elements to be stored in the array: ");
        int n = input.nextInt();

        // Create an array to store the elements
        int[] arr = new int[n];

        // Prompt the user to input elements into the array
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = input.nextInt();
        }

        // Initialize variables to store maximum and minimum
        int max = arr[0];
        int min = arr[0];

        // Find the maximum and minimum elements in the array
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Display the maximum and minimum elements
        System.out.println("Maximum element is : " + max);
        System.out.println("Minimum element is : " + min);

        // Close the Scanner
        input.close();
    }
}
