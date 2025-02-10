package com.java.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

	private final Solution solution = new Solution();

	@Test
	void testEmptyString() {
		assertEquals(0, solution.lengthOfLongestSubstring(""));
	}

	@Test
	void testSingleCharacter() {
		assertEquals(1, solution.lengthOfLongestSubstring("a"));
	}

	@Test
	void testUniqueCharacters() {
		assertEquals(3, solution.lengthOfLongestSubstring("abc"));
		assertEquals(6, solution.lengthOfLongestSubstring("abcdef"));
	}

	@Test
	void testRepeatingCharacters() {
		assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
		assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
	}

	@Test
	void testMixedCharacters() {
		assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
		assertEquals(6, solution.lengthOfLongestSubstring("dvdfabc"));
	}

	@Test
	void testLongString() {
		assertEquals(10, solution.lengthOfLongestSubstring("abcdefghijabcdefghij"));
	}
}
