package newelyAdded;

import java.util.HashMap;

public class E_ArrayElementOccurrences {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5};

        // Using a HashMap to store occurrences
        HashMap<Integer, Integer> occurrences = new HashMap<>();

        for (int num : array) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        // Print the occurrences
        System.out.println("Occurrences of each element:");
        for (int key : occurrences.keySet()) {
            System.out.println("Element: " + key + ", Count: " + occurrences.get(key));
        }
    }
}
