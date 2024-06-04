public class Insertion {
    /* Function to sort array using insertion sort */
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int currentElement = arr[i];
            int j = i - 1;

            /*
             * Move elements of arr[0..i-1], that are
             * greater than the current element, to one position ahead
             * of their current position
             */
            while (j >= 0 && arr[j] > currentElement) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = currentElement;
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };

        // Call the static sort method directly
        sort(arr);

        // Print the sorted array
        printArray(arr);
    }
}