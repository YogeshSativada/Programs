package newelyAdded;

import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 4);
        findDuplicates(numbers);
    }

    public static void findDuplicates(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : numbers) {
            if (!uniqueNumbers.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate numbers: " + duplicates);
    }
}

