import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter the coefficient a: ");
        double a = input.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = input.nextDouble();
        System.out.print("Enter the coefficient c: ");
        double c = input.nextDouble();
        input.close();
        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check the discriminant and calculate the roots
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and unequal.");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The roots are real and equal.");
            System.out.println("Root = " + root);
        } else {
            System.out.println("The equation has no real root.");
        }
    }
}
