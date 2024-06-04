import java.util.Scanner;

class Check {
    public static void main(String[] args) {
        int[] num = { 10, 45, 7, 49, 30 };
        int n;
        boolean found = false; // A flag to track if the element is found
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter Element for Searching: ");
        n = sk.nextInt();

        // Use a for-each loop to iterate through the elements of the array
        for (int i = 0; i < num.length; i++) {
            if (n == num[i]) {
                System.out.println("Element Found At Position: " + (i + 1));
                found = true; // Set the flag to true when the element is found
                break; // Exit the loop once the element is found
            }
        }

        // Check if the element was not found and display a message accordingly
        if (!found) {
            System.out.println("Element not found");
        }

        sk.close();
    }
}
