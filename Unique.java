import java.util.Scanner; // importing the Scanner class for user input

public class Unique { // starting the Unique class

    public static void main(String[] args) { // starting the main method

        int arr[] = new int[10]; // creating an array of integers with length 10
        int num[] = new int[100]; // creating an array of integers with length 100, to store the count of each
                                  // number in the input array

        Scanner sk = new Scanner(System.in); // creating a Scanner object for user input

        // taking input from user and storing it in the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at index" + i);
            arr[i] = sk.nextInt();
        }
        sk.close(); // closing the Scanner object to free up system resources

        // iterating through the array and counting the occurrences of each number
        for (int i = 0; i < arr.length; i++) {
            int r = arr[i];
            num[r]++;
        }

        System.out.println("Unique elements are :"); // printing the heading for unique elements

        // iterating through the num array and printing the numbers with count 1 (i.e.
        // unique numbers)
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) {
                System.out.println("\t" + i);
            }
        }
    }
}