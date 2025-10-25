package lab8_max_subarray;

import java.util.Random;

public class SubarrayTester {

    public static void main(String[] args) {
        int[] sizes = { 1000, 5000, 10000, 50000, 100000 };
        System.out.println("--- Maximum Subarray Sum Algorithm Comparison ---");

        for (int n : sizes) {
            int[] arr = generateRandomArrayWithNegatives(n);

            System.out.println("\n--- Testing for array size n = " + n + " ---");

            long startTime = System.currentTimeMillis();
            MaxSubarraySolver.bruteForceMaxSum(arr);
            long bruteForceTime = System.currentTimeMillis() - startTime;

            startTime = System.currentTimeMillis();
            MaxSubarraySolver.kadanesAlgorithmMaxSum(arr);
            long kadaneTime = System.currentTimeMillis() - startTime;

            System.out.printf("Brute-Force Time: %d ms%n", bruteForceTime);
            System.out.printf("Kadane’s Algorithm Time: %d ms%n", kadaneTime);
        }
    }

    public static int[] generateRandomArrayWithNegatives(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(2001) - 1000; // Range: [-1000, 1000]
        }
        return arr;
    }
}
