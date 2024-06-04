import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] originalArray = { 1, 2, 3, 4, 5 };

        // Create a new array to store the reversed elements
        int[] reversedArray = new int[originalArray.length];

        // Reverse the original array
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Print the reversed array
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }
}
