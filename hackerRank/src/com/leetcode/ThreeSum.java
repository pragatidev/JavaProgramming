/**
 * 
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pkunwer Given an array S of n integers, are there elements a, b, c in
 *         S such that a + b + c = 0? Find all unique triplets in the array
 *         which gives the sum of zero.
 *
 */
public class ThreeSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbers = { -2, 4, 5, 6, -3, -1 };
		boolean isThreeSum = isThreeSum(numbers);

		System.out.println(threeSum(numbers));

	}

	// Very Bad Implementation, takes O(n^2*log n time Runtime Complexity)
	private static boolean isThreeSum(int[] numArr) {
		Arrays.sort(numArr);
		int start = 0;
		int end = numArr.length - 1;

		while (start < numArr.length) {
			for (int sec = start + 1; sec < end; sec++) {
				int num = -(numArr[start] + numArr[sec]);
				if (Arrays.binarySearch(numArr, num) > 1)
					return true;
			}
			start++;
		}

		while (start > end) {

			start++;
			end--;
		}
		return false;
	}

	// Rutime Complexity: O(N^2)
	private static List<List<Integer>> threeSum(int[] numArr) {
		List<List<Integer>> result = new ArrayList();

		if (numArr.length < 3)
			return result;

		Arrays.sort(numArr);
		for (int i = 0; i < numArr.length; i++) {
			if (i == 0 || numArr[i] > numArr[i - 1]) {
				int negate = -numArr[i];
				int start = i + 1;
				int end = numArr.length - 1;
				while (start < end) {
					if (numArr[start] + numArr[end] == negate) {
						ArrayList<Integer> arr = new ArrayList<>();
						arr.add(numArr[i]);
						arr.add(numArr[start]);
						arr.add(numArr[end]);
						result.add(arr);
						start++;
						end--;
						while (start < end && numArr[end] == numArr[end + 1]) {
							end--;
						}

						while (start < end && numArr[start] == numArr[start - 1]) {
							start++;
						}
					}

					else if (numArr[start] + numArr[end] < negate)
						start++;
					else
						end--;
				}
			}

		}

		return result;
	}

}
