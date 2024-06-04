/**
 * s
 */
public class Exist {

  public static void main(String[] args) {
    String str = "This is a test string.";
    boolean sk = str.contains("string");
    if (sk == true) {
      System.out.println("The substring is exists in the string.");
    } else {
      System.out.println("The substring is not exists in the string.");
    }
  }
}