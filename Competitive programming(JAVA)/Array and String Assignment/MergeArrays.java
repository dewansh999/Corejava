// Java program to merge two arrays of the same size sorted in descending order

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number of elements to be stored in the first array
        System.out.print("Input the number of elements to be stored in the first array: ");
        int size = input.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] mergedArray = new int[size * 2];

        // Input elements for the first array
        System.out.println("Input " + size + " elements in the first array: ");
        for (int i = 0; i < size; i++) {
            System.out.print("element - " + i + " : ");
            array1[i] = input.nextInt();
        }

        // Input elements for the second array
        System.out.print("Input the number of elements to be stored in the second array: ");
        for (int i = 0; i < size; i++) {
            System.out.print("element - " + i + " : ");
            array2[i] = input.nextInt();
        }
        input.close();
        // Merge the two arrays in descending order
        int i = 0, j = 0, k = 0;
        while (i < size && j < size) {
            if (array1[i] >= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // If elements are remaining in the first array
        while (i < size) {
            mergedArray[k++] = array1[i++];
        }

        // If elements are remaining in the second array
        while (j < size) {
            mergedArray[k++] = array2[j++];
        }

        // Print the merged array in descending order
        System.out.println("The merged array in descending order is: ");
        for (int x = mergedArray.length - 1; x >= 0; x--) {
            System.out.print(mergedArray[x] + " ");
        }
    }
}
