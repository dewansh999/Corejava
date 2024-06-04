import java.util.Arrays;

public class Mergesort {

  public static void merge(int[] arr, int start, int mid, int end) {
    int n1 = mid - start + 1;
    int n2 = end - mid;

    int[] left = Arrays.copyOfRange(arr, start, mid + 1);
    int[] right = Arrays.copyOfRange(arr, mid + 1, end + 1);

    int i = 0, j = 0, k = start;

    while (i < n1 && j < n2) {
      if (left[i] <= right[j]) {
        arr[k++] = left[i++];
      } else {
        arr[k++] = right[j++];
      }
    }

    while (i < n1) {
      arr[k++] = left[i++];
    }

    while (j < n2) {
      arr[k++] = right[j++];
    }
  }

  public static void mergeSort(int[] arr, int start, int end) {
    if (start < end) {
      int mid = start + (end - start) / 2;
      mergeSort(arr, start, mid);
      mergeSort(arr, mid + 1, end);
      merge(arr, start, mid, end);
    }
  }

  public static void main(String[] args) {
    int[] arr = { 6, 3, 9, 5, 2, 8 };
    int size = arr.length;

    System.out.println("Before Sorting:");
    for (int i = 0; i < size; i++)
      System.out.print("\t" + arr[i]);

    mergeSort(arr, 0, size - 1);

    System.out.println("\nAfter Sorting:");
    for (int i = 0; i < size; i++)
      System.out.print("\t" + arr[i]);
  }
}
