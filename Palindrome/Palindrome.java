package com.java;


public class Palindrome {


    public static boolean isPalindrome(String input) {
        char[] characters = input.toCharArray();
        int start = 0;
        int end = characters.length - 1;
        while (start <= end) {
            if (characters[start] != characters[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
