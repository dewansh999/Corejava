public class LastIndexof {
    public static void main(String[] args) {
        String s = "Welcome to bhopal";
        int a = s.lastIndexOf("o");
        int b = s.lastIndexOf("o", 5);

        System.out.println(a);
        System.out.println(b);
    }
}
