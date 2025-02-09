package com.java.array;


public class SearchInMountainArray {

    public static boolean searchInMountainArray(int[] array, int target) {
        int peakIndex = findPeakIndex(array);
        if (binarySearch(array, target, 0, peakIndex, true) != -1) {
            return true;
        } else {
            return binarySearch(array, target, peakIndex + 1, array.length - 1, false) != -1;
        }
    }

    private static int findPeakIndex(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] > array[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private static int binarySearch(int[] array, int target, int start, int end, boolean isAscending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (target < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < array[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1; // Target not found
    }
}
