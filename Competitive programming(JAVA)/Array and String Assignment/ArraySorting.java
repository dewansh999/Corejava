import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Input the size of array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        // Input elements in the array
        System.out.println("Input " + size + " elements in the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = input.nextInt();
        }

        // Sort the array in ascending order using Bubble Sort
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted elements
        System.out.println("Elements of array in sorted ascending order:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        input.close();
    }
}
