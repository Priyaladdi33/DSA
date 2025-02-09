package com.java.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CielingNumberTest {


    @Test
    void cielingFunction_findsCieling() {
        int[] arr = {2, 4, 6, 8, 9, 10, 11};
        int target = 7;
        int res = CielingNumber.cielingFunction(arr, target);
        assertEquals(3, res);
    }

    @Test
    void cielingFunction_noCielingFound() {
        int[] arr = {2, 4, 6, 8, 9, 10, 11};
        int target = 12;
        int res = CielingNumber.cielingFunction(arr, target);
        assertEquals(-1, res);
    }

    @Test
    void cielingFunction_targetIsElement() {
        int[] arr = {2, 4, 6, 8, 9, 10, 11};
        int target = 8;
        int res = CielingNumber.cielingFunction(arr, target);
        assertEquals(3, res);
    }

    @Test
    void cielingFunction_singleElementArray() {
        int[] arr = {5};
        int target = 3;
        int res = CielingNumber.cielingFunction(arr, target);
        assertEquals(0, res);
    }

    @Test
    void cielingFunction_singleElementArray_noCieling() {
        int[] arr = {5};
        int target = 6;
        int res = CielingNumber.cielingFunction(arr, target);
        assertEquals(-1, res);
    }


}