package com.java.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void binarySearch_findsElement() {
        int[] arr = {2, 3, 4, 5, 6, 54, 67, 88};
        int left = 0;
        int right = arr.length;
        int key = 88;
        int res = BinarySearch.binarySearch(arr, left, right, key);
        assertEquals(7, res);
    }

    @Test
    void binarySearch_elementNotFound() {
        int[] arr = {2, 3, 4, 5, 6, 54, 67, 88};
        int left = 0;
        int right = arr.length;
        int key = 1;
        int res = BinarySearch.binarySearch(arr, left, right, key);
        assertEquals(-1, res);
    }

    @Test
    void binarySearch_emptyArray() {
        int[] arr = {};
        int left = 0;
        int right = arr.length;
        int key = 4;
        int res = BinarySearch.binarySearch(arr, left, right, key);
        assertEquals(-1, res);
    }

    @Test
    void binarySearch_singleElementArray_found() {
        int[] arr = {4};
        int left = 0;
        int right = arr.length;
        int key = 4;
        int res = BinarySearch.binarySearch(arr, left, right, key);
        assertEquals(0, res);
    }

    @Test
    void binarySearch_singleElementArray_notFound() {
        int[] arr = {4};
        int left = 0;
        int right = arr.length;
        int key = 5;
        int res = BinarySearch.binarySearch(arr, left, right, key);
        assertEquals(-1, res);
    }
}