package stringPrograms;

public class B_ReverseStringWithoutSpaces {
    public static void main(String[] args) {
        String original = "Hello Yogesh";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            char currentChar = original.charAt(i);
            if (currentChar != ' ') { // Skip spaces
                reversed = reversed + currentChar;
            }
        }

        System.out.println("Reversed string without spaces: " + reversed);
    }
}
