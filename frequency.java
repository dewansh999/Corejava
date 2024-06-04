public class frequency {
  public static void main(String[] args) {
    int n = 1234123560; // Initialize the integer n
    System.out.println(n); // Print the value of n
    System.out.println(Integer.MAX_VALUE); // Print the maximum value of integer
    int A[] = new int[10]; // Create an array to store the frequency of digits

    // Iterate through each digit of n
    while (n != 0) {
      int r = n % 10; // Calculate the remainder when n is divided by 10 (gives the last digit)
      A[r]++; // Increment the frequency of digit r in the array
      n = n / 10; // Update n by removing the last digit
    }

    System.out.println("Frequency of all numbers:");

    // Print the frequency of each digit from 0 to 9
    for (int i = 0; i < A.length; i++) {
      System.out.printf("\nFrequency of %d : %d", i, A[i]); // Print the frequency of digit i
    }
  }
}
