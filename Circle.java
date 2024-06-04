import java.util.Scanner; // Import the Scanner class for user input

public class Circle {

    public static void main(String[] args) {
        // Declare variables for radius, area, and circumference
        float r, ar, cr;

        // Create a new Scanner object for user input
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.println("Enter Radius of circle");
        r = s.nextFloat(); // Read the user input and store it in the radius variable

        // Calculate the area and circumference of the circle
        ar = 3.14f * r * r;
        cr = 2 * 3.14f * r;

        // Print the results
        System.out.println("Area of Circle: " + ar);
        System.out.println("Circumference of circle: " + cr);

        // Close the Scanner object to free up system resources
        s.close();
    }
}