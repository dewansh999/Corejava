import java.util.Scanner; // import the Scanner class to read user input

public class Student {
    public static void main(String[] args) {
        // create a new Scanner object to read from the console
        Scanner s = new Scanner(System.in);

        // prompt the user to enter their email
        System.out.println("Enter your E-mail");
        // read the user's email as a string
        String email = s.next();
        // consume the newline character left-over from the user's input
        s.nextLine();

        // prompt the user to enter their name
        System.out.println("Enter your name");
        // read the user's name as a string
        String name = s.next();
        // consume the newline character left-over from the user's input
        s.nextLine();

        // prompt the user to enter their section
        System.out.println("Enter your section");
        // read the user's section as a character by taking the third character of the
        // input string
        char section = s.next().charAt(2);

        // print the user's name, email, and section
        System.out.println("Your Name: " + name);
        System.out.println("Your E-mail: " + email);
        System.out.println("Your Section: " + section);

        // close the scanner to release system resources
        s.close();
    }
}