package com.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PalindromeTest {

    @Test
    void testPalindrome() {
        assertTrue(Palindrome.isPalindrome("madam"));
        assertTrue(Palindrome.isPalindrome("racecar"));
        assertTrue(Palindrome.isPalindrome("a"));
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    void testNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
        assertFalse(Palindrome.isPalindrome("world"));
        assertFalse(Palindrome.isPalindrome("java"));
    }
}