package com.java.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MedianOfTwoSortedArrayTest {

	private final MedianOfTwoSortedArray medianFinder = new MedianOfTwoSortedArray();

	@Test
	void testFindMedianOddLength() {
		int[] nums1 = { 1, 3 };
		int[] nums2 = { 2 };
		double expected = 2.0;
		double result = medianFinder.findMedianSortedArrays(nums1, nums2);
		assertEquals(expected, result, "Median should be 2.0");
	}

	@Test
	void testFindMedianEvenLength() {
		int[] nums1 = { 1, 2 };
		int[] nums2 = { 3, 4 };
		double expected = 2.5;
		double result = medianFinder.findMedianSortedArrays(nums1, nums2);
		assertEquals(expected, result, "Median should be 2.5");
	}

	@Test
	void testFindMedianSingleElementEach() {
		int[] nums1 = { 2 };
		int[] nums2 = { 1 };
		double expected = 1.5;
		double result = medianFinder.findMedianSortedArrays(nums1, nums2);
		assertEquals(expected, result, "Median should be 1.5");
	}

	@Test
	void testFindMedianOneEmptyArray() {
		int[] nums1 = {};
		int[] nums2 = { 3, 4 };
		double expected = 3.5;
		double result = medianFinder.findMedianSortedArrays(nums1, nums2);
		assertEquals(expected, result, "Median should be 3.5");
	}

	@Test
	void testFindMedianBothEmptyArrays() {
		int[] nums1 = {};
		int[] nums2 = {};
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			medianFinder.findMedianSortedArrays(nums1, nums2);
		});
		assertEquals("Input arrays are empty", exception.getMessage(),
				"Exception message should be 'Input arrays are empty'");
	}
}
