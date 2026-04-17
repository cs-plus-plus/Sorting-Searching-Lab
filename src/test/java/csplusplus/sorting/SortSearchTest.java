package csplusplus.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortSearchTest {

    // ── selectionSort ─────────────────────────────────────────────────

    @Test
    void selectionSort_basic() {
        int[] a = {5, 2, 8, 1, 3};
        SortSearch.selectionSort(a);
        assertArrayEquals(new int[]{1, 2, 3, 5, 8}, a);
    }

    @Test
    void selectionSort_alreadySorted() {
        int[] a = {1, 2, 3, 4, 5};
        SortSearch.selectionSort(a);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, a);
    }

    @Test
    void selectionSort_reverse() {
        int[] a = {9, 7, 5, 3, 1};
        SortSearch.selectionSort(a);
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, a);
    }

    @Test
    void selectionSort_duplicates() {
        int[] a = {3, 1, 3, 1, 2};
        SortSearch.selectionSort(a);
        assertArrayEquals(new int[]{1, 1, 2, 3, 3}, a);
    }

    @Test
    void selectionSort_empty() {
        int[] a = {};
        SortSearch.selectionSort(a);
        assertArrayEquals(new int[]{}, a);
    }

    // ── insertionSort ─────────────────────────────────────────────────

    @Test
    void insertionSort_basic() {
        int[] a = {5, 2, 8, 1, 3};
        SortSearch.insertionSort(a);
        assertArrayEquals(new int[]{1, 2, 3, 5, 8}, a);
    }

    @Test
    void insertionSort_single() {
        int[] a = {42};
        SortSearch.insertionSort(a);
        assertArrayEquals(new int[]{42}, a);
    }

    @Test
    void insertionSort_duplicates() {
        int[] a = {4, 2, 4, 2, 4};
        SortSearch.insertionSort(a);
        assertArrayEquals(new int[]{2, 2, 4, 4, 4}, a);
    }

    // ── merge ─────────────────────────────────────────────────────────

    @Test
    void merge_basic() {
        int[] out = SortSearch.merge(new int[]{1, 3, 5}, new int[]{2, 4, 6});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, out);
    }

    @Test
    void merge_oneEmpty() {
        assertArrayEquals(new int[]{1, 2, 3},
            SortSearch.merge(new int[]{}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3},
            SortSearch.merge(new int[]{1, 2, 3}, new int[]{}));
    }

    @Test
    void merge_unevenLengths() {
        int[] out = SortSearch.merge(new int[]{1, 10}, new int[]{2, 3, 4, 5});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 10}, out);
    }

    // ── mergeSort ─────────────────────────────────────────────────────

    @Test
    void mergeSort_basic() {
        int[] a = {5, 2, 8, 1, 3, 7, 4, 6};
        SortSearch.mergeSort(a);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, a);
    }

    @Test
    void mergeSort_odd() {
        int[] a = {9, 1, 5, 3, 7};
        SortSearch.mergeSort(a);
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, a);
    }

    @Test
    void mergeSort_duplicates() {
        int[] a = {3, 1, 3, 1, 3};
        SortSearch.mergeSort(a);
        assertArrayEquals(new int[]{1, 1, 3, 3, 3}, a);
    }

    @Test
    void mergeSort_empty() {
        int[] a = {};
        SortSearch.mergeSort(a);
        assertArrayEquals(new int[]{}, a);
    }

    // ── binarySearchIterative ─────────────────────────────────────────

    @Test
    void binarySearchIterative_found() {
        int[] a = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(3, SortSearch.binarySearchIterative(a, 7));
        assertEquals(0, SortSearch.binarySearchIterative(a, 1));
        assertEquals(6, SortSearch.binarySearchIterative(a, 13));
    }

    @Test
    void binarySearchIterative_notFound() {
        int[] a = {1, 3, 5, 7, 9};
        assertEquals(-1, SortSearch.binarySearchIterative(a, 4));
        assertEquals(-1, SortSearch.binarySearchIterative(a, 100));
        assertEquals(-1, SortSearch.binarySearchIterative(a, -1));
    }

    @Test
    void binarySearchIterative_empty() {
        assertEquals(-1, SortSearch.binarySearchIterative(new int[]{}, 1));
    }

    // ── binarySearchRecursive ─────────────────────────────────────────

    @Test
    void binarySearchRecursive_found() {
        int[] a = {2, 4, 6, 8, 10, 12};
        assertEquals(2, SortSearch.binarySearchRecursive(a, 6));
        assertEquals(0, SortSearch.binarySearchRecursive(a, 2));
        assertEquals(5, SortSearch.binarySearchRecursive(a, 12));
    }

    @Test
    void binarySearchRecursive_notFound() {
        int[] a = {2, 4, 6, 8, 10};
        assertEquals(-1, SortSearch.binarySearchRecursive(a, 5));
        assertEquals(-1, SortSearch.binarySearchRecursive(a, 0));
        assertEquals(-1, SortSearch.binarySearchRecursive(a, 99));
    }

    @Test
    void binarySearchRecursive_empty() {
        assertEquals(-1, SortSearch.binarySearchRecursive(new int[]{}, 1));
    }
}
