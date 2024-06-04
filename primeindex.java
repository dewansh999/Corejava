public class primeindex {
  public static void main(String args[]) {
    int arr[] = { 10, 51, 20, 61, 31,  23 , 55 }; // Array of integers

    int sum = 0; // Initialize sum to 0
    for (int i = 1; i < arr.length; i++) { // Loop through each element of the array
      int count = 0; // Initialize count of factors to 0
      for (int j = 1; j <= i; j++) { // Loop from 1 to the index of the current element
        if (i % j == 0) { // Check if j is a factor of i
          count++; // Increment count if j is a factor of i
        }
      }
      if (count == 2) { // If count is 2, i is prime
        sum += arr[i]; // Add the prime number to sum
      }
    }
    System.out.println(sum); // Print the sum of prime numbers
  }
}
