package newelyAdded;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "sativada rao";

        String[] words = input.split(" ");
        
        String reversedWord1 = reverseUsingLoop(words[0]);
        String reversedWord2 = reverseUsingLoop(words[1]);

        String result = reversedWord1 + " " + reversedWord2;

        System.out.println("Reversed string: " + result);
    }

    public static String reverseUsingLoop(String str) {
        char[] chars = str.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        return reversed;
    }
}
