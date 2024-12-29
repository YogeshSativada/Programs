package arrays;

import java.util.Arrays;

public class A_DuplicateNumbersInArrayOptimized {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 4}; // Input array

        // Sort the array
        Arrays.sort(numbers);

        System.out.println("Duplicate numbers in the array:");
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                System.out.println(numbers[i]);
                i++; // Skip the next duplicate to avoid repeated prints
            }
        }
    }
}

