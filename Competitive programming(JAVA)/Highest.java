public class Highest {
    public static void main(String[] args) {
        int[] arr = { 10, 200, 20, 500, 60 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Highest element of array " + max);
    }
}
