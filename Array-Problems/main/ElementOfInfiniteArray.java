package com.java.array;

public class ElementOfInfiniteArray {

    public static int findElementInInfiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (end < arr.length && arr[end] < target) {
            int newStart = end + 1;
            end = end + 2 * (end - start + 1);
            start = newStart;
        }
        end = Math.min(end, arr.length - 1);
        return binarySearch(arr, target, start, end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
