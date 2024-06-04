public class StaticVariables {
    static int a = 12;

    static void fun() {
        int b = 10;
        System.out.println(a + "  " + b);
        ++a;
        ++b;
    }

    public static void main(String[] args) {
        fun();
        fun();
        fun();
    }
}
