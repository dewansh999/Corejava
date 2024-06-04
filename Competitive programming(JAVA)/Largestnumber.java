public class Largestnumber {
    public static void main(String[] args) {
        int arr[] = { 12, 434, 56, 77, 34, 55 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                System.out.println(arr[i]);
            }

        }
    }
}
