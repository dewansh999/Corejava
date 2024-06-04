public class StaticBlock {
    static {
        System.out.println("This is block 1");
    }

    public static void main(String[] args) {
        System.out.println("This is main method ");
    }

    static {
        System.out.println("This is block 2");
    }
}
