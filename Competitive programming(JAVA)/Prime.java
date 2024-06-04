public class Prime {
    // Function to check if a number is prime
    public static int isPrime(int n) {
        // Edge case: 1 is not a prime number
        if (n == 1) {
            return 1;
        }
        // Check for prime by iterating from 2 to the square root of N
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // If N is divisible by any number in this range, it's not prime
            if (n % i == 0) {
                return 1;
            }
        }
        // If no divisors are found, N is prime
        return 2;
    }

    public static void main(String[] args) {
        // Example usage:
        // Check if 7 is prime
        int result1 = isPrime(7); // Should return 2

        // Check if 10 is prime
        int result2 = isPrime(10); // Should return 1

        // Print the results
        System.out.println(result1);
        System.out.println(result2);

    }
}
