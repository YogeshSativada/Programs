package stringPrograms;

public class D_CapitalizeFirstLetterBasic {
    public static void main(String[] args) {  
        String input = "hello world";
   
        // Split the string into words and capitalize
        String[] words = input.split(" ");                              //words will be an array of two elements: ["hello", "world"]
    
        String result = "";
        for (String word : words) {
            if (!word.isEmpty()) {
                result = result + word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            }
        }

        // Print the result
        System.out.println("Output: " + result.trim());
    }
}

