package com.java.array;

public class SmallestLetter {

    public static char findSmallestLetter(char[] letters, char target) {
        int index = findCeilingIndex(letters, target);
        if (index != -1) {
            return letters[index];
        } else {
            return ' ';
        }
    }

    private static int findCeilingIndex(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (letters.length == 0 || letters[end] <= target) {
            return 0;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] == target) {
                return mid;
            } else if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
