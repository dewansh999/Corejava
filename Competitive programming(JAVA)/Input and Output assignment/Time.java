public class Time {
    public static void main(String[] args) {
        int a = 25300, h, e, m, s;
        h = a / 3600;
        e = a % 3600;
        m = e / 60;
        s = e % 60;
        System.out.println("H:M:S - " + h + ":" + m + ":" + s);
    }
}
