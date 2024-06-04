
public class trycatch {

    public static void main(String[] args) {
        int a, b, c = 0;
        a = 10;
        b = 0;
        System.out.println("Before");
        try {
            c = a / b;
            System.out.println("Try block");
        } catch (ArithmeticException e) {
            System.out.println("This is catch block");
            System.out.println("denominater should not be 0");
            // TODO: handle exception
        }
        System.out.println("After");
        System.out.println("This is the division" + c);
    }
}