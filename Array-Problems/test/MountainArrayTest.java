package com.java.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainArrayTest {

    @Test
    void findPeakIndex_peakFound() {
        int[] array = {2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2};
        int result = MountainArray.findPeakIndex(array);
        assertEquals(5, result);
    }

    @Test
    void findPeakIndex_singleElementArray() {
        int[] array = {1};
        int result = MountainArray.findPeakIndex(array);
        assertEquals(0, result);
    }

    @Test
    void findPeakIndex_twoElementArray() {
        int[] array = {1, 2};
        int result = MountainArray.findPeakIndex(array);
        assertEquals(1, result);
    }

    @Test
    void findPeakIndex_noPeak() {
        int[] array = {1, 2, 3, 4, 5};
        int result = MountainArray.findPeakIndex(array);
        assertEquals(4, result);
    }
}