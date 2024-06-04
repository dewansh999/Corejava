import java.util.Scanner; // Importing Scanner class for user input

public class Caseconverter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Any Character: ");
    char ch = scanner.next().charAt(0);
    char oldChar = ch;
    char newChar;

    if (ch >= 'A' && ch <= 'Z') {
      newChar = (char) (ch + 32);
    }

    else if (ch >= 'a' && ch <= 'z') {
      newChar = (char) (ch - 32);
    }

    else {
      newChar = ch;
    }

    System.out.println("Old character is: " + oldChar);
    System.out.println("New Character is: " + newChar);
    scanner.close();
  }
}
