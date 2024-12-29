package numberPrograms;

public class E_FibonacciIterative {
    public static void main(String[] args) {
        int n = 10; // Number of terms to generate
        int a = 0, b = 1; // First two Fibonacci numbers

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " "); // Print the current number
            int next = a + b; // Calculate the next number
            a = b; // Update a to the previous b
            b = next; // Update b to the new value
        }
    }
}
