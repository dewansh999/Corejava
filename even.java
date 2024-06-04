import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter any number");
        Scanner sl = new Scanner(System.in);
        a = sl.nextInt();
        switch (a % 2) {
            case 0:
                System.out.println("Even number");
                break;
            case 1:
                System.out.println("Odd number");
                break;

            default:
                break;
        }
        sl.close();
    }
}
