package lab8_sorting_race;

public class SortingAlgorithms {

    /**
     * Implements the Selection Sort algorithm.
     * Theoretical Complexity: O(n^2)
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min_idx) {
                    min_idx = j;
                }
                int temp = arr[min_idx];
                arr[min_idx] = arr[j];
                arr[j] = temp;
            }
        }
    }

    /**
     * Implements the Insertion Sort algorithm.
     * Theoretical Complexity: O(n^2) / Best-Case: O(n)
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int elem_to_insert = arr[i];
            int j = i - 1;

            // If elem at pointer j is larger than elem to insert, swap values
            while (j >= 0 && arr[j] > elem_to_insert) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = elem_to_insert;
        }
    }

    /**
     * Implements the Merge Sort algorithm. Public-facing method.
     * Theoretical Complexity: O(n log n)
     */
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Already sorted
        }
        int[] temp = new int[arr.length];
        mergeSortRecursive(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSortRecursive(int[] arr, int[] temp, int left, int right) {
        if (left >= right) {
            return; // single element
        }

        int mid = left + (right - left) / 2;

        // Sort left half
        mergeSortRecursive(arr, temp, left, mid);

        // Sort right half
        mergeSortRecursive(arr, temp, mid + 1, right);

        // Merge the two halves
        merge(arr, temp, left, mid, right);
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
            }
        }

        while (i <= mid) {
            arr[k++] = temp[i++];
        }

    }
}
