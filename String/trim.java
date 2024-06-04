public class trim {
    public static void main(String[] args) {
        String s = "  HELLO WORLD  ";
        System.out.println("Length before trim :" + s.length());
        System.out.println(s);
        String s1 = s.trim();
        System.out.println("Length After trim:" + s1.length());
        System.out.println(s1);
    }
}
