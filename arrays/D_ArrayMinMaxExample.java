package arrays;

import java.util.Arrays;

public class D_ArrayMinMaxExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3};
        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Minimum: " + min);
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Maximum: " + max);
    }
}

