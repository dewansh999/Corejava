public class delete {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        s.append("Welcome to bhopal");
        System.out.println(s);
        s.delete(10, 18);
        s.deleteCharAt(0);
        System.out.println(s);
        System.out.println(s.capacity());
    }
}
