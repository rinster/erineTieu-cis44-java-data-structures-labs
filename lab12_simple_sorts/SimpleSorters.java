package lab12_simple_sorts;

import java.util.Comparator;

public class SimpleSorters {

    /**
     * Sorts an array using the optimized Bubble Sort algorithm.
     */
    public static void bubbleSort(K[] S, Comparator comp) {
        int n = S.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            // TODO: Implement the inner loop j
            // ...
            if (comp.compare(S[j], S[j + 1]) > 0) {
                // TODO: Swap S[j] and S[j+1]
                swapped = true;
            }
            // ... end inner loop ...

            // TODO: Add check for early termination
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Sorts an array using the Insertion Sort algorithm.
     */
    public static void insertionSort(K[] S, Comparator comp) {
        int n = S.length;
        for (int i = 1; i < n; i++) {
            K cur = S[i];
            int j = i - 1;

            // TODO: Implement the while loop to shift elements
            while (j >= 0 && comp.compare(S[j], cur) > 0) {
                S[j + 1] = S[j];
                j--;
            }

            // TODO: Insert 'cur' into its correct position
            S[j + 1] = cur;
        }
    }
}
