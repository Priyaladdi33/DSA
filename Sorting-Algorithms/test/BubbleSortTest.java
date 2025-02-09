package com.java.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {


    @Test
    void bubbleSort_sortsArray() {
        int[] arr = {2, 4, 6, 1, 3, 8};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 6, 8}, arr);
    }

    @Test
    void bubbleSort_sortsEmptyArray() {
        int[] arr = {};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void bubbleSort_sortsSingleElementArray() {
        int[] arr = {1};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    void bubbleSort_sortsAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void bubbleSort_sortsReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

}