package numberPrograms;

public class D_FactorialIterative {
    public static void main(String[] args) {
        int number = 3;

        // Calculate factorial using iteration
        long factorial = 1; // Use long to handle large values
        for (int i = 1; i <= number; i++) {
            factorial = factorial*i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

