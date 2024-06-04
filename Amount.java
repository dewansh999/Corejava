
// Let's create a magic program that changes big numbers into smaller ones, like a money exchange!
import java.util.Scanner; // We need a special tool to ask the user for a number.

public class Amount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Our special tool is ready!

        System.out.print("Enter the amount: "); // We ask the user to tell us a big number.

        int amount = scanner.nextInt(); // We listen to what the user says and remember their number.

        convertToSmallestBankNotes(amount); // Now, we use our magic function to make the big number smaller.

        scanner.close(); // We say, "Thank you!" and put away our special tool.
    }

    private static void convertToSmallestBankNotes(int amount) {
        int[] bankNotes = {  1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 }; // These are our magic numbers, like specia
                                                                        // 
                                                                        // coins.

        System.out.println("Amount: " + amount); // We show the user the original big number.

        for (int note : bankNotes) { // We check each magic coin one by one.
            int count = amount / note; // We see how many times the coin fits into the big number.

            amount %= note; // We see what's left after using the magic coin.

            if (count > 0) {
                System.out.println(note + " notes: " + count); // We tell the user how many magic coins they get.
            }
        }
    }
}
