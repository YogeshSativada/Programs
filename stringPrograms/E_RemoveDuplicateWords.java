package stringPrograms;

public class E_RemoveDuplicateWords {
    public static void main(String[] args) {
        String input = "Yogesh is good good boy Yogesh boy ";

        // Split the input string into words
        String[] words = input.split(" ");

        String result = "";

        // Loop through each word in the array
        for (int i = 0; i < words.length; i++) {
            // Check if the word is already in the result
            if (result.indexOf(words[i]) == -1) {
                result = result+words[i] + " "; // Append if it's not already added
            }
        }

        // Print the result after removing duplicates
        System.out.println("String without duplicate words: " + result.trim());
    }
}

