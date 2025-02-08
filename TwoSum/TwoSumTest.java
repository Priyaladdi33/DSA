package com.java.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class TwoSumTest {

	@Test
	void testTwoSumFound() {
		TwoSum twoSum = new TwoSum();
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] result = twoSum.twoSum(nums, target);

		assertNotNull(result, "Result should not be null");
		assertEquals(target, nums[result[0]] + nums[result[1]],
				"Sum of elements at returned indices should be equal to target");

	}

	@Test
	void testTwoSumNotFound() {
		TwoSum twoSum = new TwoSum();
		int[] nums = { 1, 2, 3, 4 };
		int target = 10;
		int[] result = twoSum.twoSum(nums, target);

		assertNull(result, "Result should be null when no two numbers sum to target");
	}

	@Test
	void testTwoSumWithDuplicates() {
		TwoSum twoSum = new TwoSum();
		int[] nums = { 3, 3, 4, 5 };
		int target = 6;
		int[] result = twoSum.twoSum(nums, target);

		assertNotNull(result, "Result should not be null");
		assertEquals(6, nums[result[0]] + nums[result[1]], "Sum should match the target");
	}

	@Test
	void testTwoSumWithNegativeNumbers() {
		TwoSum twoSum = new TwoSum();
		int[] nums = { -3, 4, 3, 90 };
		int target = 0;
		int[] result = twoSum.twoSum(nums, target);

		assertNotNull(result, "Result should not be null");
		assertEquals(0, nums[result[0]] + nums[result[1]], "Sum should match the target");
	}
}
