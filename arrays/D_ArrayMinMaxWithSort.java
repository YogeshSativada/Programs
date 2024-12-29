package arrays;

import java.util.Arrays;

public class D_ArrayMinMaxWithSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3};
        Arrays.sort(numbers);
        int min = numbers[0]; // First element
        int max = numbers[numbers.length - 1]; // Last element
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}

