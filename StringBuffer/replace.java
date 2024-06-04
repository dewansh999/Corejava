public class replace {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        s.append("Welcome to bhopal");
        System.out.println(s);
        s.replace(10, 15, " indore");
        System.out.println(s);
        System.out.println(s.capacity());
    }
}
