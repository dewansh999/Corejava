public class append {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        s.append("This is String Buffer Object ");
        s.append(" Value of PI is ");
        s.append(3.14);
        s.append(" This is ");
        s.append(true);
        System.out.println(s);
        System.out.println(s.capacity());
    }
}
