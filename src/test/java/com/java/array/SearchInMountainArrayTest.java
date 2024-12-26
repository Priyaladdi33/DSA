package com.java.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SearchInMountainArrayTest {

    @Test
    void searchInMountainArray_elementFound() {
        int[] array = {1, 2, 3, 4, 9, 11, 7, 6, 5, 4, 3, 2};
        int target = 9;
        boolean result = SearchInMountainArray.searchInMountainArray(array, target);
        assertTrue(result);
    }

    @Test
    void searchInMountainArray_elementNotFound() {
        int[] array = {1, 2, 3, 4, 9, 11, 7, 6, 5, 4, 3, 2};
        int target = 10;
        boolean result = SearchInMountainArray.searchInMountainArray(array, target);
        assertFalse(result);
    }


    @Test
    void searchInMountainArray_singleElementArray_found() {
        int[] array = {5};
        int target = 5;
        boolean result = SearchInMountainArray.searchInMountainArray(array, target);
        assertTrue(result);
    }

    @Test
    void searchInMountainArray_singleElementArray_notFound() {
        int[] array = {5};
        int target = 3;
        boolean result = SearchInMountainArray.searchInMountainArray(array, target);
        assertFalse(result);
    }
}