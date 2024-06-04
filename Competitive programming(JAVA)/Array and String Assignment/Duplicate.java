import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements to be stored in the array
        System.out.print("Input the number of elements to be stored in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input elements in the array
        System.out.println("Input " + n + " elements in the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int duplicateCount = 0;

        // Check for duplicates
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    duplicateCount++;
                    break;
                }
            }
        }

        System.out.println("Total number of duplicate elements found in the array is : " + duplicateCount);
    }
}
