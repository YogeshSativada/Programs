package patterns;

public class AlphabetPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        for (int i = 1; i <= rows; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

