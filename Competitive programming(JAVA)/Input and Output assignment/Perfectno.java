import java.util.Scanner;

public class Perfectno {
    public static void main(String[] args) {
        int a, sum = 0;
        System.out.println("Enter the number for perfect number");
        Scanner sl = new Scanner(System.in);
        a = sl.nextInt();
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        if (a == sum) {
            System.out.println("This perfect number");
        } else
            System.out.println("This is not perfect number");
    }
}
