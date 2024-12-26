package com.java.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloorOfNumberTest {


    @Test
    void findFloor_elementFound() {
        int[] array = {2, 4, 6, 8, 9, 10, 11};
        int target = 6;
        int result = FloorOfNumber.findFloor(array, target);
        assertEquals(2, result);
    }

    @Test
    void findFloor_elementNotFound() {
        int[] array = {2, 4, 6, 8, 9, 10, 11};
        int target = 5;
        int result = FloorOfNumber.findFloor(array, target);
        assertEquals(1, result);
    }

    @Test
    void findFloor_noFloorFound() {
        int[] array = {2, 4, 6, 8, 9, 10, 11};
        int target = 1;
        int result = FloorOfNumber.findFloor(array, target);
        assertEquals(-1, result);
    }

    @Test
    void findFloor_emptyArray() {
        int[] array = {};
        int target = 7;
        int result = FloorOfNumber.findFloor(array, target);
        assertEquals(-1, result);
    }

    @Test
    void findFloor_singleElementArray_found() {
        int[] array = {5};
        int target = 5;
        int result = FloorOfNumber.findFloor(array, target);
        assertEquals(0, result);
    }

    @Test
    void findFloor_singleElementArray_notFound() {
        int[] array = {5};
        int target = 6;
        int result = FloorOfNumber.findFloor(array, target);
        assertEquals(0, result);
    }
}