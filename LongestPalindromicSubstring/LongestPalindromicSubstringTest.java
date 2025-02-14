package com.java.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestPalindromicSubstringTest {

	private LongestPalindromicSubstring lps;

	@BeforeEach
	void setUp() {
		lps = new LongestPalindromicSubstring();
	}

	@Test
	void testSingleCharacter() {
		assertEquals("a", lps.longestPalindrome("a"));
	}

	@Test
	void testTwoCharacterPalindrome() {
		assertEquals("aa", lps.longestPalindrome("aa"));
	}

	@Test
	void testTwoCharacterNonPalindrome() {
		assertEquals("a", lps.longestPalindrome("ab"));
	}

	@Test
	void testSimplePalindrome() {
		assertEquals("aba", lps.longestPalindrome("aba"));
	}

	@Test
	void testMultiplePalindromes() {
		assertEquals("anana", lps.longestPalindrome("bananas"));
	}

	@Test
	void testEntireStringPalindrome() {
		assertEquals("racecar", lps.longestPalindrome("racecar"));
	}

	@Test
	void testNoPalindromeLongerThanOne() {
		assertEquals("a", lps.longestPalindrome("abcdef"));
	}

	@Test
	void testEmptyString() {
		assertEquals("", lps.longestPalindrome(""));
	}

	@Test
	void testLongString() {
		assertEquals("anana", lps.longestPalindrome("abcdefananaghi"));
	}
}
