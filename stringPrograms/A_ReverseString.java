package stringPrograms;

public class A_ReverseString {
    public static void main(String[] args) {
        String original = "Yogesh";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}

