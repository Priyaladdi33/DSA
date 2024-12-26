package com.java.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void sort_sortsArray() {
        int[] array = {3, 3, 5, 1, 7, 7, 2, 8, 8, 9};
        InsertionSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 3, 5, 7, 7, 8, 8, 9}, array);
    }

    @Test
    void sort_sortsEmptyArray() {
        int[] array = {};
        InsertionSort.sort(array);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    void sort_sortsSingleElementArray() {
        int[] array = {1};
        InsertionSort.sort(array);
        assertArrayEquals(new int[]{1}, array);
    }

    @Test
    void sort_sortsAlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        InsertionSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    void sort_sortsReverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};
        InsertionSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }
}