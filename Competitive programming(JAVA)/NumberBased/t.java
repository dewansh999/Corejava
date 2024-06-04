import java.util.Scanner;

public class t {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input number: ");
    int userInput = scanner.nextInt();

    int dayOfWeek = (userInput % 7 == 0) ? 7 : (userInput % 7);
    String weekdayName;
    switch (dayOfWeek) {
      case 1:
        weekdayName = "Sunday";
        break;
      case 2:
        weekdayName = "Monday";
        break;
      case 3:
        weekdayName = "Tuesday";
        break;
      case 4:
        weekdayName = "Wednesday";
        break;
      case 5:
        weekdayName = "Thursday";
        break;
      case 6:
        weekdayName = "Friday";
        break;
      case 7:
        weekdayName = "Saturday";
        break;
      default:
        weekdayName = "Invalid day";
        break;
    }
    System.out.println(weekdayName);
  }
}
