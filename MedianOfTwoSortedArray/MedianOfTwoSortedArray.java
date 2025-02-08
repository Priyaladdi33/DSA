package com.java.practice;

public class MedianOfTwoSortedArray {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length, n = nums2.length;

		if (nums1.length == 0 && nums2.length == 0) {
			throw new IllegalArgumentException("Input arrays are empty");
		}
		int merged[] = new int[m + n];

		// Merge two sorted arrays using two-pointer technique
		int i = 0, j = 0, k = 0;
		while (i < m && j < n) {
			if (nums1[i] < nums2[j]) {
				merged[k++] = nums1[i++];
			} else {
				merged[k++] = nums2[j++];
			}
		}
		while (i < m)
			merged[k++] = nums1[i++];
		while (j < n)
			merged[k++] = nums2[j++];

		// Find median
		int len = m + n;
		if (len % 2 != 0) {
			return merged[len / 2]; // Odd case
		} else {
			return (merged[len / 2] + merged[(len / 2) - 1]) / 2.0; // Even case
		}
	}
}
