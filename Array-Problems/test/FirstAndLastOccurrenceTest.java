package com.java.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastOccurrenceTest {


    @Test
    void findFirstAndLastOccurrence_elementFound() {
        int[] array = {3, 6, 7, 7, 7, 8, 8, 8, 10, 12};
        int target = 8;
        int[] result = FirstAndLastOccurrence.findFirstAndLastOccurrence(array, target);
        assertArrayEquals(new int[]{5, 7}, result);
    }

    @Test
    void findFirstAndLastOccurrence_elementNotFound() {
        int[] array = {3, 6, 7, 7, 7, 8, 8, 8, 10, 12};
        int target = 9;
        int[] result = FirstAndLastOccurrence.findFirstAndLastOccurrence(array, target);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void findFirstAndLastOccurrence_emptyArray() {
        int[] array = {};
        int target = 8;
        int[] result = FirstAndLastOccurrence.findFirstAndLastOccurrence(array, target);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void findFirstAndLastOccurrence_singleElementArray_found() {
        int[] array = {8};
        int target = 8;
        int[] result = FirstAndLastOccurrence.findFirstAndLastOccurrence(array, target);
        assertArrayEquals(new int[]{0, 0}, result);
    }

    @Test
    void findFirstAndLastOccurrence_singleElementArray_notFound() {
        int[] array = {7};
        int target = 8;
        int[] result = FirstAndLastOccurrence.findFirstAndLastOccurrence(array, target);
        assertArrayEquals(new int[]{-1, -1}, result);
    }
}