import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int a, factorial = 1;
        System.out.println("Enter the number for factorial");
        Scanner sl = new Scanner(System.in);
        a = sl.nextInt();
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        System.out.println("factorial " + factorial);
    }
}
