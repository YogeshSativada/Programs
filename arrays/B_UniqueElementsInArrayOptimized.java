package arrays;

import java.util.Arrays;

public class B_UniqueElementsInArrayOptimized {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 4}; // Input array

        // Sort the array
        Arrays.sort(numbers);

        System.out.println("Unique elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            // Check if current element is not equal to previous and next elements
            if ((i == 0 || numbers[i] != numbers[i - 1]) && 
                (i == numbers.length - 1 || numbers[i] != numbers[i + 1])) {
                System.out.println(numbers[i]);
            }
        }
    }
}

