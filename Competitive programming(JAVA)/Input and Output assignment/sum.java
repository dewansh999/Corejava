import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int a, sum = 0;
        System.out.println("Enter the number for n number");
        Scanner sk = new Scanner(System.in);
        a = sk.nextInt();
        // int i = 1;
        // while (i <= a) {
        // sum += i;
        // i++;
        // }
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
