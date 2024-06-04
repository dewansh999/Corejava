import java.util.Scanner;

public class UniqueElementsInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number of elements
        System.out.print("Input the number of elements to be stored in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        // Input elements in the array
        System.out.println("Input " + n + " elements in the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = input.nextInt();
        }
        input.close();

        // Find unique elements
        System.out.println("The unique elements found in the array are:");
        for (int i = 0; i < n; i++) {
            boolean isUnique = true;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
