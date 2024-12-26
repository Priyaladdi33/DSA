package com.java.search;


public class RotatedBinarySearch {

    public static int search(int[] array, int target) {
        int pivot = findPivot(array);
        if (pivot == -1) {
            return binarySearch(array, target, 0, array.length - 1);
        }
        if (array[pivot] == target) {
            return pivot;
        }
        if (target >= array[0]) {
            return binarySearch(array, target, 0, pivot);
        } else {
            return binarySearch(array, target, pivot + 1, array.length - 1);
        }
    }

    private static int findPivot(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && array[mid] > array[mid + 1]) {
                return mid;
            }
            if (mid > start && array[mid] < array[mid - 1]) {
                return mid - 1;
            }
            if (array[mid] <= array[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                return mid; // Target found
            }
        }
        return -1; // Target not found
    }

}