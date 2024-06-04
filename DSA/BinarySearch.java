
public class BinarySearch {
  public static int binarySearch(int[] arr, int low, int high, int target) {
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return -1; // Element not found
  }

  public static void main(String[] args) {
    int[] arr = { 4, 11, 15, 23, 29, 34, 50, 90, 156, 291 };
    int size = arr.length;
    int target = 90;

    int result = binarySearch(arr, 0, size - 1, target);

    if (result != -1) {
      System.out.println("Element found at index: " + result);
    } else {
      System.out.println("Element not found");
    }
  }
}
