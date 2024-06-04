import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int countPositive = 0;
        int sumPositive = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();

            if (num > 0) {
                countPositive++;
                sumPositive += num;
            }
        }

        scanner.close();

        double averagePositive = countPositive > 0 ? (double) sumPositive / countPositive : 0;

        System.out.println("Number of positive numbers: " + countPositive);
        System.out.println("Average of positive numbers: " + averagePositive);
    }
}
