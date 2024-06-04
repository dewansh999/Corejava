
public class Max {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4 };
        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
        }
        System.out.println(Max);
    }
}
