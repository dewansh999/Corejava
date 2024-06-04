
public class Year {
    public static void main(String[] args) {
        int a = 2535, y, b, d, m, e, f;
        y = a / 365;
        b = 365 * y;
        f = a - b;
        m = f / 30;
        e = 30 * m;
        d = f - e;
        System.out.println(y + " Years");
        System.out.println(m + " Months");
        System.out.println(d + " Days");
    }
}
