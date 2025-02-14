package com.java.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseIntegerTest {

	private ReverseInteger reverseInteger;

	@BeforeEach
	void setUp() {
		reverseInteger = new ReverseInteger();
	}

	@Test
	void testPositiveNumber() {
		assertEquals(321, reverseInteger.reverse(123));
	}

	@Test
	void testNegativeNumber() {
		assertEquals(-321, reverseInteger.reverse(-123));
	}

	@Test
	void testNumberWithTrailingZeros() {
		assertEquals(21, reverseInteger.reverse(120));
	}

	@Test
	void testZero() {
		assertEquals(0, reverseInteger.reverse(0));
	}

	@Test
	void testOverflow() {
		assertEquals(0, reverseInteger.reverse(1534236469));
	}

	@Test
	void testUnderflow() {
		assertEquals(0, reverseInteger.reverse(-2147483648));
	}
}
