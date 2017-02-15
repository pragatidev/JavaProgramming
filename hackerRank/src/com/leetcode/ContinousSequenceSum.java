/**
 * 
 */
package com.leetcode;

/**
 * @author pkunwer
 * 
 *         Given a sequence of positive integers A and integer T, return whether
 *         there is a continuous sequence of A that sums up to exactly T
 *
 */
public class ContinousSequenceSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nums[] = { 23, 5, 4, 7, 2, 11 };
		int target = 20;

		System.out.println(isSequenceExist(nums, target));
	}

	private static boolean isSequenceExist(int[] arr, int target) {

		int sum = 0;
		int nextIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			while (nextIndex < arr.length && sum < target) {
				sum = sum + arr[nextIndex];
				nextIndex++;
			}
			if (sum == target)
				return true;

			sum = sum - arr[i];
		}

		return false;
	}

}
