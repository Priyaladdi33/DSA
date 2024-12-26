package com.java.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementOfInfiniteArrayTest {


    @Test
    void findElementInInfiniteArray_elementFound() {
        int[] arr = {2, 3, 5, 6, 7, 8, 9, 12, 13, 14, 16, 17, 18};
        int target = 7;
        int result = ElementOfInfiniteArray.findElementInInfiniteArray(arr, target);
        assertEquals(4, result);
    }

    @Test
    void findElementInInfiniteArray_elementNotFound() {
        int[] arr = {2, 3, 5, 6, 7, 8, 9, 12, 13, 14, 16, 17, 18};
        int target = 15;
        int result = ElementOfInfiniteArray.findElementInInfiniteArray(arr, target);
        assertEquals(-1, result);
    }

    @Test
    void findElementInInfiniteArray_emptyArray() {
        int[] arr = {};
        int target = 7;
        int result = ElementOfInfiniteArray.findElementInInfiniteArray(arr, target);
        assertEquals(-1, result);
    }

    @Test
    void findElementInInfiniteArray_singleElementArray_found() {
        int[] arr = {7};
        int target = 7;
        int result = ElementOfInfiniteArray.findElementInInfiniteArray(arr, target);
        assertEquals(0, result);
    }

    @Test
    void findElementInInfiniteArray_singleElementArray_notFound() {
        int[] arr = {7};
        int target = 8;
        int result = ElementOfInfiniteArray.findElementInInfiniteArray(arr, target);
        assertEquals(-1, result);
    }


}