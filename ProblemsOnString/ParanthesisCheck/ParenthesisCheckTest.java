package com.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ParenthesisCheckTest {

    @Test
    void testBalancedParentheses() {
        assertTrue(ParenthesisCheck.isBalanced("()"));
        assertTrue(ParenthesisCheck.isBalanced("()[]{}"));
        assertTrue(ParenthesisCheck.isBalanced("{[()]}"));
    }

    @Test
    void testUnbalancedParentheses() {
        assertFalse(ParenthesisCheck.isBalanced("(]"));
        assertFalse(ParenthesisCheck.isBalanced("([)]"));
        assertFalse(ParenthesisCheck.isBalanced("{[(])}"));
    }

    @Test
    void testEmptyString() {
        assertTrue(ParenthesisCheck.isBalanced(""));
    }

    @Test
    void testSingleTypeParentheses() {
        assertTrue(ParenthesisCheck.isBalanced("((()))"));
        assertFalse(ParenthesisCheck.isBalanced("((())"));
    }
}