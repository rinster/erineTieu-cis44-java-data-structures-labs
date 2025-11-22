package lab12_advanced_sorts;

import java.util.Arrays;
import java.util.Comparator;

public class AdvancedSorters {

    // --- MergeSort ---
    public static void mergeSort(K[] S, Comparator comp) {
        int n = S.length;
        if (n < 2)
            return; // Base case

        // TODO: Divide
        int mid = n / 2;
        K[] S1 = Arrays.copyOfRange(S, 0, mid);
        K[] S2 = Arrays.copyOfRange(S, mid, n);

        // TODO: Conquer (recursive calls)
        mergeSort(S1, comp);
        mergeSort(S2, comp);

        // TODO: Combine
        merge(S, S1, S2, comp);
    }

    private static void merge(K[] S, K[] S1, K[] S2, Comparator comp) {
        int i = 0, j = 0;
        // TODO: Implement the merge logic from the lecture
        // while (i < S1.length && j < S2.length) ...
        // ...
        // TODO: Copy remaining elements of S1 or S2
        // ...
    }

    // --- QuickSort ---
    public static void quickSort(K[] S, Comparator comp) {
        quickSort(S, comp, 0, S.length - 1);
    }

    private static void quickSort(K[] S, Comparator comp, int a, int b) {
        if (a >= b)
            return; // Base case

        // TODO: Divide
        int pivotIndex = partition(S, comp, a, b);

        // TODO: Conquer (recursive calls)
        quickSort(S, comp, a, pivotIndex - 1);
        quickSort(S, comp, pivotIndex + 1, b);
    }

    private static int partition(K[] S, Comparator comp, int a, int b) {
        // TODO: Implement partition logic (e.g., Hoare's from lecture)
        // 1. Choose a pivot (e.g., S[a])
        // 2. Set up 'left' and 'right' pointers
        // 3. Loop and swap elements
        // 4. Return the final index of the pivot
        return a; // placeholder
    }
}
