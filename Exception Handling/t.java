public class t {
    public static void main(String[] args) {
        int n = 12;
        try {
            n = Integer.parseInt(args[1]);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("String should have at least one value");
            ae.printStackTrace();
        } catch (NumberFormatException ne) {
            System.out.println("String should have on");
            ne.printStackTrace();
        }
        System.out.println("Square is :" + (n * n));
    }
}
