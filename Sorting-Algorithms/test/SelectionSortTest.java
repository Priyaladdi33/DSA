package com.java.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SelectionSortTest {

    @Test
    void selectionSort_sortedArray() {
        int[] array = {3, 3, 5, 1, 7, 7, 2, 8, 8, 9};
        int[] expected = {1, 2, 3, 3, 5, 7, 7, 8, 8, 9};
        SelectionSort.selectionSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void selectionSort_emptyArray() {
        int[] array = {};
        int[] expected = {};
        SelectionSort.selectionSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void selectionSort_singleElementArray() {
        int[] array = {5};
        int[] expected = {5};
        SelectionSort.selectionSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void selectionSort_alreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        SelectionSort.selectionSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void selectionSort_reverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        SelectionSort.selectionSort(array);
        assertArrayEquals(expected, array);
    }
}