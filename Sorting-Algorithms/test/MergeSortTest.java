package com.java.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest  {

    @Test
    void sort_sortsArray() {
        int[] array = {3, 2, 5, 8, 5, 9, 6, 1, 9};
        MergeSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 5, 5, 6, 8, 9, 9}, array);
    }

    @Test
    void sort_sortsEmptyArray() {
        int[] array = {};
        MergeSort.sort(array);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    void sort_sortsSingleElementArray() {
        int[] array = {1};
        MergeSort.sort(array);
        assertArrayEquals(new int[]{1}, array);
    }

    @Test
    void sort_sortsAlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        MergeSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    void sort_sortsReverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};
        MergeSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }
}