package stringPrograms;

public class F_RemoveDuplicateCharacters {
    public static void main(String[] args) {
        
        String input = "hymayogesh";

        // Initialize an empty string to store the result
        String result = "";

        // Loop through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            // Check if the character is already in the result string
            if (result.indexOf(currentChar) == -1) {
                result =result + currentChar; // Append if it's not already added
            }
        }

        // Print the result
        System.out.println("String without duplicates: " + result);
    }
}
