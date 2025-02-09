package com.java.search;

public class BinarySearch {
    public static int binarySearch(int[] arr, int left, int right, int key) {
        int mid = (left + right) / 2;
        while (left < right) {
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                return binarySearch(arr, left, mid - 1, key);
            } else {
                return binarySearch(arr, mid + 1, right, key);
            }
        }
        return -1;
    }
}
