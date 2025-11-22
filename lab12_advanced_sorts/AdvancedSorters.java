package lab12_advanced_sorts;

import java.util.Arrays;
import java.util.Comparator;

public class AdvancedSorters {

    // --- MergeSort ---
    public static <K> void mergeSort(K[] S, Comparator<K> comp) {
        int n = S.length;
        if (n < 2)
            return; // Base case

        // Divide
        int mid = n / 2;
        K[] S1 = Arrays.copyOfRange(S, 0, mid);
        K[] S2 = Arrays.copyOfRange(S, mid, n);

        // Conquer (recursive calls)
        mergeSort(S1, comp);
        mergeSort(S2, comp);

        // Combine
        merge(S, S1, S2, comp);
    }

    private static <K> void merge(K[] S, K[] S1, K[] S2, Comparator<K> comp) {
        int i = 0, j = 0, k = 0;

        while (i < S1.length && j < S2.length) {
            if (comp.compare(S1[i], S2[j]) <= 0) {
                S[k++] = S1[i++];
            } else {
                S[k++] = S2[j++];
            }
        }

        // Copy remaining elements
        while (i < S1.length)
            S[k++] = S1[i++];
        while (j < S2.length)
            S[k++] = S2[j++];
    }

    // --- QuickSort ---
    public static <K> void quickSort(K[] S, Comparator<K> comp) {
        quickSort(S, comp, 0, S.length - 1);
    }

    private static <K> void quickSort(K[] S, Comparator<K> comp, int a, int b) {
        if (a >= b)
            return; // Base case

        // Partition
        int pivotIndex = partition(S, comp, a, b);

        // Recurse on subarrays
        quickSort(S, comp, a, pivotIndex - 1);
        quickSort(S, comp, pivotIndex + 1, b);
    }

    private static <K> int partition(K[] S, Comparator<K> comp, int a, int b) {
        K pivot = S[b]; // Choose last element as pivot
        int i = a - 1;

        for (int j = a; j < b; j++) {
            if (comp.compare(S[j], pivot) <= 0) {
                i++;
                K temp = S[i];
                S[i] = S[j];
                S[j] = temp;
            }
        }

        // Place pivot in correct position
        K temp = S[i + 1];
        S[i + 1] = S[b];
        S[b] = temp;

        return i + 1;
    }
}
