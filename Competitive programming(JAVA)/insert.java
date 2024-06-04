import java.util.Scanner;

public class insert {
  public static void main(String[] args) {
    System.out.println("At what position you want to add ram in Hello");
    Scanner ss = new Scanner(System.in);
    int index = ss.nextInt();
    StringBuffer s = new StringBuffer();
    s.append("Hello");
    s.insert(index, "Ram");
    System.out.println(s);
  }

}
