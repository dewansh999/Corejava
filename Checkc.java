import java.util.Scanner;

public class Checkc {
    public static void main(String[] args) {
        char c;
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter any value");
        c = sk.next().charAt(0);
        if (c >= 'a' && c <= 'z') {
            System.out.println("Lower case");
        } else if (c >= 'A' && c <= 'Z') {
            System.out.println("Upper case");
        } else if (c >= '0' && c <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special value");
        }
        sk.close();
    }
}
