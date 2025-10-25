package lab8_max_subarray;

public class MaxSubarraySolver {

    /**
     * Finds the maximum subarray sum using a brute-force approach.
     * Theoretical Complexity: O(n^2)
     */
    public static int bruteForceMaxSum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        // Outer loop picks the start index
        for (int i = 0; i < n; i++) { // n primitive ops
            int currentSum = 0; // 1 primitive op per iteration

            // Inner loop extends the subarray
            for (int j = i; j < n; j++) { // n * (n-i) ops total
                currentSum += arr[j]; // 1 primitive op per inner iteration
                if (currentSum > maxSum) // 1 comparison op
                    maxSum = currentSum; // 1 assignment op
            }
        }
        return maxSum;
    }

    /**
     * Finds the maximum subarray sum using Kadane's Algorithm.
     * Theoretical Complexity: O(n)
     */
    public static int kadanesAlgorithmMaxSum(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }
}
