package numberPrograms;


public class B_PalindromeNumber {
    public static void main(String[] args) {
        int number = 156651;

        // Store the original number for comparison
        int originalNumber = number;

        // Reverse the number
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit
            number = number/10; // Remove the last digit
        }

        // Check if the original number is equal to the reversed number
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
