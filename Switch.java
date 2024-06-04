import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        char c;
        System.out.println("Enter any character");
        Scanner sk = new Scanner(System.in);
        c = sk.next().charAt(0);
        switch (c) {
            case 'a':
            case 'A':
                System.out.println("It is vowel");
                break;
            case 'e':
            case 'E':
                System.out.println("It is vowel");
                break;
            case 'i':
            case 'I':
                System.out.println("It is vowel");
                break;
            case 'o':
            case 'O':
                System.out.println("It is vowel");
                break;
            case 'u':
            case 'U':
                System.out.println("It is vowel");
                break;
            default:
                System.out.println("NOt an vowel");
                break;
        }
        sk.close();
    }
}
