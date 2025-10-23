package lab8_sorting_race;

import java.util.Arrays;
import java.util.Random;

public class SortingTester {

    public static void main(String[] args) {
        int[] sizes = { 1000, 5000, 10000, 25000, 50000, 100000 };

        System.out.println("--- The Sorting Race ---");

        for (int n : sizes) {
            System.out.println("\n--- Testing for array size n = " + n + " ---");

            // TODO: Call your test methods for Average, Best, and Worst cases.
        }
    }

    // TODO: Implement the runAndTimAllSorts helper method.

    public static int[] generateRandomArray(int size) {
        // Implementation provided in previous response
        return null;
    }

    public static int[] generateSortedArray(int size) {
        // Implementation provided in previous response
        return null;
    }

    public static int[] generateReverseSortedArray(int size) {
        // Implementation provided in previous response
        return null;
    }
}