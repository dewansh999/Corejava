import java.util.Scanner;

class College {
  protected String cname;
  protected int code;

  College() {
    System.out.println("This is College class Default constructor");
  }

  College(String cname, int code) {
    this.cname = cname;
    this.code = code;
    System.out.println("This is College class Parameterized constructor");
  }

  public void acceptData() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter College Name:");
    // Assuming cname is a String
    String cname = sc.nextLine();

    System.out.println("Enter College Code:");
    // Check if the next token is an integer
    if (sc.hasNextInt()) {
      int code = sc.nextInt();
      // Process the integer input
    } else {
      // If not an integer, clear the scanner and prompt the user again
      System.out.println("Invalid input. Please enter an integer for the College Code.");
      sc.nextLine(); // Clear the scanner
    }

    // Continue with the rest of the method...
  }

  public void showData() {
    System.out.println("College Name : " + cname);
    System.out.println("College Code : " + code);
  }

}
