import java.util.Scanner;

public class Centigrade {

    public static void main(String[] args) {
        float c, f;
        System.out.println("Enter the Centigrade(°C)");
        Scanner sk = new Scanner(System.in);
        c = sk.nextFloat();
        f = ((9 * c + 32 * 5)) / 5;
        System.out.println("Fahrenheit :" + f + "°F");
    }
}