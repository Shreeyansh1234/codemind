package Practice;

public class reverseNo {

	public static void main(String[] args) {
		int number = 12345;  // Example number to reverse
        int reversed = reverseNumber(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversed);
    }

    public static int reverseNumber(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;  // Extract the last digit
            reversed = reversed * 10 + digit;  // Build the reversed number
            num /= 10;  // Remove the last digit
        }

        return reversed;
	}

}
