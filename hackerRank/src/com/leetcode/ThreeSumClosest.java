/**
 * 
 */
package com.leetcode;

import java.util.Arrays;

/**
 * @author pkunwer
 *
 */
public class ThreeSumClosest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nums[] = { 0, 1, 2 };
		System.out.println(threeSumClosest(nums, 0));
	}

	public static int threeSumClosest(int[] nums, int target) {
		int result = nums[0]+ nums[1]+ nums[2];

		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			int current = nums[i];
			int start = i + 1;
			int end = nums.length - 1;

			while (start < end) {
				int expTarget = nums[start] + nums[end] + current;
				if (expTarget == target) {
					return expTarget;
				} else if (expTarget < target) {					
					start++;
				} else {
					end--;
				}
				
				if(Math.abs(expTarget - target) < Math.abs(result - target)){
					result = expTarget;
				}
			}
		}
		return result;
	}

}
