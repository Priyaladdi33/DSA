package com.java.practice;

import java.util.HashSet;

class Solution {
	public int lengthOfLongestSubstring(String s) {
		int left = 0, right = 0, maxLen = 0;
		HashSet<Character> set = new HashSet<>();

		while (right < s.length()) {
			if (!set.contains(s.charAt(right))) {
				set.add(s.charAt(right));
				maxLen = Math.max(maxLen, right - left + 1);
				right++;
			} else {
				// Remove from set until duplicate is removed
				set.remove(s.charAt(left));
				left++;
			}
		}
		return maxLen;
	}
	 public static void main(String[] args) {
	        Solution solution = new Solution();
	        System.out.println(solution.lengthOfLongestSubstring("dvdfabc")); // Expected Output: 5
	    }
}
