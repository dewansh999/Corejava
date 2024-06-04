public class Main {
  public static void main(String[] args) {
    String str = "this is a test string";
    String arr[] = str.split(" ");
    for (String s : arr) {
      System.out.println(s);
    }
  }
}
