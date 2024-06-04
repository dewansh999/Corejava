public class Divisible35 {
    public static void main(String[] args) {
        for (int i = 1; i < 51; i++)
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
    }
}
