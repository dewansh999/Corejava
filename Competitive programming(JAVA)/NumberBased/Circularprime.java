
public class Circularprime {
  public static void main(String[] args) {
    int n = 1193, ld, rn, factors = 0;
    while (n != 0) {
      ld = n % 10;
      rn = n / 10;
      String s = Integer.toString(ld) + Integer.toString(rn);
      System.out.println(s);
      int num = Integer.parseInt(s);
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        factors++;
        break;
      }
    }
    if (factors == 0) {
      System.out.println("This is a prime number");
    } else {
      System.out.println("Not a prime number");
    }
  }
}
