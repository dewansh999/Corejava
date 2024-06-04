public class Test {
    public static void main(String[] args) {
        int n = 0;
        try {
            n = Integer.parseInt(args[0]);
            if (n < 0 || n > 100) {
                age ae = new age("Invalid Age");
                throw ae;
            }
            System.out.println("Valid age" + n);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("please enter age");
        } catch (NumberFormatException ne) {
            System.out.println("please enter number");
        } catch (age x) {
            System.out.println(x.getMsg());
        }
    }
}
