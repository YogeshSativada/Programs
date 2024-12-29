package arrays;

public class A_DuplicateNumbersInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 4}; // Input array

        System.out.println("Duplicate numbers in the array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    break; // Avoid printing the same number multiple times
                }
            }
        }
    }
}

