package com.leetcode;

public class ContiguousSubArrayLargestSum {

	public static void main(String[] args) {
		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println("Maximum subarray Sum is: " + largestContiguousSum(arr));

	}

	private static int largestContiguousSum(int[] arr) {
		int maxSum = arr[0];
		int currentSum = maxSum;

		for (int i = 1; i < arr.length; i++) {
			currentSum = Math.max(arr[i], currentSum + arr[i]);
			maxSum = Math.max(currentSum, maxSum);
		}

		return maxSum;
	}

}
