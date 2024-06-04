import java.util.Scanner;

public class SeparateOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements to be stored in the array
        System.out.print("Input the number of elements to be stored in the array: ");
        int n = scanner.nextInt();

        // Input elements into the array
        int[] elements = new int[n];
        System.out.println("Input " + n + " elements in the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            elements[i] = scanner.nextInt();
        }

        // Initialize arrays for even and odd elements
        int[] evenArray = new int[n];
        int[] oddArray = new int[n];
        int evenCount = 0;
        int oddCount = 0;

        // Separate even and odd elements
        for (int element : elements) {
            if (element % 2 == 0) {
                evenArray[evenCount++] = element;
            } else {
                oddArray[oddCount++] = element;
            }
        }
        // evenArray[evenCount++] = element;: If the current element is even
        // (satisfies the condition in the if statement),
        // it's assigned to the evenArray. evenCount is used as an index to keep track
        // of where the even number should be stored in the evenArray. After storing the
        // element in evenArray, evenCount is incremented to prepare for the next even
        // number.
        scanner.close();
        // Display even elements
        System.out.print("The Even elements are : ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();

        // Display odd elements
        System.out.print("The Odd elements are : ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();
    }
}
