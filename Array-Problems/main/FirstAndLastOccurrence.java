package com.java.array;

public class FirstAndLastOccurrence {

    public static int[] findFirstAndLastOccurrence(int[] array, int target) {
        int[] result = {-1, -1};
        result[0] = binarySearch(array, target, true);
        result[1] = binarySearch(array, target, false);
        return result;
    }

    private static int binarySearch(int[] array, int target, boolean findFirst) {
        int start = 0, end = array.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                result = mid;
                if (findFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}
