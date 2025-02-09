package com.java.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    @Test
    void search_elementFound() {
        int[] array = {1, 4, 2, 6, 3};
        int key = 3;
        boolean result = LinearSearch.search(array, key);
        assertTrue(result);
    }

    @Test
    void search_elementNotFound() {
        int[] array = {1, 4, 2, 6, 3};
        int key = 5;
        boolean result = LinearSearch.search(array, key);
        assertFalse(result);
    }

    @Test
    void search_emptyArray() {
        int[] array = {};
        int key = 3;
        boolean result = LinearSearch.search(array, key);
        assertFalse(result);
    }

    @Test
    void search_singleElementArray_found() {
        int[] array = {3};
        int key = 3;
        boolean result = LinearSearch.search(array, key);
        assertTrue(result);
    }

    @Test
    void search_singleElementArray_notFound() {
        int[] array = {1};
        int key = 3;
        boolean result = LinearSearch.search(array, key);
        assertFalse(result);
    }
}