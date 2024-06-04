// Rewritten optimized selection sort algorithm
public class Selectionsort {
  public static void main(String[] args) {
    int[] arr = { 3, 4, 2, 5, 1 };
    int size = arr.length;

    System.out.println("Before Sorting : ");
    printArray(arr);

    selectionSort(arr);

    System.out.println("\nAfter Sorting : ");
    printArray(arr);
  }

  public static void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int minIdx = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIdx]) {
          minIdx = j;
        }
      }
      if (minIdx != i) {
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
      }
    }
  }

  public static void printArray(int[] arr) {
    for (int num : arr) {
      System.out.print("\t" + num);
    }
  }
}
