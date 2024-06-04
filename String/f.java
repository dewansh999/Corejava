public class f {
  public static void main(String[] args) {
    String s = "This is a test string";
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      char d = s.charAt(i);
      if (d == 'i') {
        count++;
      }
    }
    System.out.println(count);
  }
}
