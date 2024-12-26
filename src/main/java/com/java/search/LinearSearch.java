package com.java.search;


public class LinearSearch {

    public static boolean search(int[] array, int key) {
        for (int element : array) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }
}