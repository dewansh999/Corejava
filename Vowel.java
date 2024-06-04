import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        char c;
        System.out.println("Enter any character ");
        Scanner sk = new Scanner(System.in);
        c = sk.next().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Given character is vowel");
        } else {
            System.out.println("Chart is not vowel");
        }
    }

}
