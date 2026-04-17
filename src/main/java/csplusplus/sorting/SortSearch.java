package csplusplus.sorting;

/**
 * CS++ Sorting & Searching Lab — SortSearch
 *
 * Implement the sorts in place (void return) and the searches returning the
 * found index or -1. Do NOT use java.util.Arrays.sort() or Collections.sort().
 *
 * CED: 4.14 (sorting), 4.15 (binary search), 4.16/4.17 (recursion)
 */
public final class SortSearch {

    private SortSearch() { /* utility class */ }

    /**
     * Selection sort, ascending, in place.
     * Invariant: after iteration i, arr[0..i] is sorted and holds the i+1
     * smallest elements of the original array.
     */
    public static void selectionSort(int[] arr) {
        throw new UnsupportedOperationException("selectionSort not implemented");
    }

    /**
     * Insertion sort, ascending, in place.
     * Invariant: after iteration i, arr[0..i] is sorted (though it may not
     * yet contain the smallest elements overall).
     */
    public static void insertionSort(int[] arr) {
        throw new UnsupportedOperationException("insertionSort not implemented");
    }

    /**
     * Recursive merge sort, ascending, in place.
     * Use {@link #merge(int[], int[])} as your combine step.
     */
    public static void mergeSort(int[] arr) {
        throw new UnsupportedOperationException("mergeSort not implemented");
    }

    /**
     * Merge two sorted arrays into one new sorted array.
     * Both inputs are assumed to be in ascending order.
     * Used as the combine step of merge sort.
     */
    public static int[] merge(int[] left, int[] right) {
        throw new UnsupportedOperationException("merge not implemented");
    }

    /**
     * Iterative binary search on a sorted (ascending) array.
     * Return the index of target, or -1 if not found.
     * If duplicates exist, any valid index is acceptable.
     */
    public static int binarySearchIterative(int[] sorted, int target) {
        throw new UnsupportedOperationException("binarySearchIterative not implemented");
    }

    /**
     * Recursive binary search entry point. Delegates to a private helper
     * with explicit lo/hi bounds. Returns index or -1.
     */
    public static int binarySearchRecursive(int[] sorted, int target) {
        throw new UnsupportedOperationException("binarySearchRecursive not implemented");
    }
}
