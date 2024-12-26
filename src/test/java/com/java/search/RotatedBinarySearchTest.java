package com.java.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotatedBinarySearchTest {

    @Test
    void search_elementNotFound() {
        int[] array = {2, 3, 4, 9, 5, 6, 7};
        int target = 8;
        int result = RotatedBinarySearch.search(array, target);
        assertEquals(-1, result);
    }

    @Test
    void search_emptyArray() {
        int[] array = {};
        int target = 5;
        int result = RotatedBinarySearch.search(array, target);
        assertEquals(-1, result);
    }

    @Test
    void search_singleElementArray_found() {
        int[] array = {5};
        int target = 5;
        int result = RotatedBinarySearch.search(array, target);
        assertEquals(0, result);
    }

    @Test
    void search_singleElementArray_notFound() {
        int[] array = {5};
        int target = 3;
        int result = RotatedBinarySearch.search(array, target);
        assertEquals(-1, result);
    }
}