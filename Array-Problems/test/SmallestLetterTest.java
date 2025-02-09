package com.java.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SmallestLetterTest {

    @Test
    void findSmallestLetter_found() {
        char[] letters = {'a', 'c', 'e', 'f', 'j'};
        char target = 'k';
        char result = SmallestLetter.findSmallestLetter(letters, target);
        assertEquals('a', result);
    }

    @Test
    void findSmallestLetter_notFound() {
        char[] letters = {'a', 'c', 'e', 'f', 'j'};
        char target = 'j';
        char result = SmallestLetter.findSmallestLetter(letters, target);
        assertEquals('a', result);
    }

    @Test
    void findSmallestLetter_singleElementArray_found() {
        char[] letters = {'a'};
        char target = 'a';
        char result = SmallestLetter.findSmallestLetter(letters, target);
        assertEquals('a', result);
    }

    @Test
    void findSmallestLetter_singleElementArray_notFound() {
        char[] letters = {'a'};
        char target = 'b';
        char result = SmallestLetter.findSmallestLetter(letters, target);
        assertEquals('a', result);
    }
}