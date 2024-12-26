package com.java.array;

public class CielingNumber {

    public static int cielingFunction(int[] arr, int target) {
        int s = 0, e = arr.length - 1;
        if (arr[arr.length - 1] < target) {
            return -1;
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }
}
