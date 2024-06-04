

// import java.util.Scanner;
// public class Unique {
//     public static void main(String[] args) {
//         int arr[] = new int[10];
//         int num[] = new int[100];
//         Scanner sk = new Scanner(System.in);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println("Enter element at index" + i);
//             arr[i] = sk.nextInt();
//         }
//         sk.close();
//         for (int i = 0; i < arr.length; i++) {
//             int r = arr[i];
//             num[r]++;
//         }
//         System.out.println("Unique elements are :");
//         {
//             for (int i = 0; i < num.length; i++) {
//                 if (num[i] == 1) {
//                     System.out.println("\t" + i);
//                 }
//             }
//         }
//     }
// }
import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        int arrLength = 10;
        int[] arr = new int[arrLength];
        int[] num = new int[100];

        Scanner sk = new Scanner(System.in);

        for (int i = 0; i < arrLength; i++) {
            System.out.println("Enter element at index " + i);
            arr[i] = sk.nextInt();
        }

        sk.close();

        System.out.println("Unique elements are :");
        for (int value : arr) {
            num[value]++;
        }
        // num[value]++;: Inside the loop, this line is responsible for counting the
        // occurrences of each unique element. The num array is being used to keep track
        // of the counts of different elements. value is the current element being
        // processed in the loop.

        // num is assumed to be an array where the index represents the unique elements
        // in the arr array.
        // value is used as an index to access the corresponding element in the num
        // array.
        // num[value] represents the count of how many times the element value appears
        // in the arr array.
        // num[value]++ increments the count for the element value by 1 each time it's
        // encountered in the loop.

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) {
                System.out.println("\t" + i);
            }
        }
    }
}
