import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner sk = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sk.nextInt();

        int[] num = new int[size];
        float sum = 0;

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Element of Index " + i + ":");
            num[i] = sk.nextInt();
            sum += num[i];
        }

        sk.close();

        if (size > 0) {
            float avg = sum / size;
            System.out.println("Average of Array: " + avg);
            System.out.println("Sum of Array: " + sum);
        } else {
            System.out.println("Array size should be greater than 0.");
        }
    }
}
