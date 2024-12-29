package stringPrograms;


public class C_PalindromeString {
    public static void main(String[] args) {
    	
        String originalString = "Hi Yogesh hsegoY ih";

        // Remove spaces and convert to lowercase for uniform comparison
        String cleanedString = originalString.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversedString = "";
        for (int i = cleanedString.length() - 1; i >= 0; i--) {
            reversedString =  reversedString + cleanedString.charAt(i);
        }

        // Check if the original string (cleaned) is equal to the reversed string
        if (cleanedString.equals(reversedString)) {
            System.out.println(originalString + " : is a palindrome.");
        } else {
            System.out.println(originalString + " : is not a palindrome.");
        }
    }
}

