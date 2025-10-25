package lab8_sorting_race;

import java.util.Arrays;
import java.util.Random;

public class SortingTester {

    public static void main(String[] args) {
        int[] sizes = { 1000, 5000, 10000, 25000, 50000, 100000 };

        System.out.println("--- The Sorting Race ---");

        for (int n : sizes) {
            System.out.println("\n--- Testing for array size n = " + n + " ---");

            // Average case (random array)
            int[] averageCase = generateRandomArray(n);
            System.out.println("\nAverage Case:");
            runAndTimeAllSorts(averageCase);

            // Best case (already sorted)
            int[] bestCase = generateSortedArray(n);
            System.out.println("\nBest Case:");
            runAndTimeAllSorts(bestCase);

            // Worst case (reverse sorted)
            int[] worstCase = generateReverseSortedArray(n);
            System.out.println("\nWorst Case:");
            runAndTimeAllSorts(worstCase);

        }
        // System.out.println(Arrays.toString(generateRandomArray(10)));
    }

    /**
     * Runs and times all sorting algorithms on the same data.
     * Creates copies of the array so each sort runs on the same input.
     */
    public static void runAndTimeAllSorts(int[] arr) {
        // --- Selection Sort ---
        int[] copy1 = Arrays.copyOf(arr, arr.length);
        long start = System.nanoTime();
        SortingAlgorithms.selectionSort(copy1);
        long end = System.nanoTime();
        System.out.printf("Selection Sort: %.3f ms%n", (end - start) / 1_000_000.0);

        // --- Insertion Sort ---
        int[] copy2 = Arrays.copyOf(arr, arr.length);
        start = System.nanoTime();
        SortingAlgorithms.insertionSort(copy2);
        end = System.nanoTime();
        System.out.printf("Insertion Sort: %.3f ms%n", (end - start) / 1_000_000.0);

        // --- Merge Sort ---
        int[] copy3 = Arrays.copyOf(arr, arr.length);
        start = System.nanoTime();
        SortingAlgorithms.mergeSort(copy3);
        end = System.nanoTime();
        System.out.printf("Merge Sort: %.3f ms%n", (end - start) / 1_000_000.0);
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] randArray = new int[size];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = random.nextInt(size);
        }
        return randArray;
    }

    public static int[] generateSortedArray(int size) {
        int[] sortedArray = new int[size];
        for (int i = 0; i < size; i++) {
            sortedArray[i] = i;
        }
        return sortedArray;
    }

    public static int[] generateReverseSortedArray(int size) {
        int[] reverseArray = new int[size];
        for (int i = 0; i < size; i++) {
            reverseArray[i] = size - i;
        }
        return reverseArray;
    }
}