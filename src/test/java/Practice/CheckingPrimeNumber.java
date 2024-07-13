package Practice;

public class CheckingPrimeNumber {

	public static void main(String[] args) {
		int n = 11;
        boolean isPrime = true; // Assume n is prime initially

        // Check if n is less than 2
        if (n < 2) {
            isPrime = false;
        } else {
            // Check for factors from 2 to n-1
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false; // Found a factor, n is not prime
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

	}

}
