/**
 * 
 */
package com.leetcode;

/**
 * @author pkunwer Reverse digits of an integer. Example1: x = 123, return 321
 *         Example2: x = -123, return -321
 *
 */
public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int data = 123;
		int revData = reverse(data);
		System.out.print("reverse value is: " + revData);

	}

	private static int reverse(int val) {
		int data = val;
		int res = 0;
		boolean flag = false;

		if (data < 0) {
			data = 0 - val;
			flag = true;
		}

		while (data > 0) {
			int mod = data % 10;
			data = data / 10;
			res = res * 10 + mod;
		}

		if (flag)
			res = 0 - res;
		return res;
	}
}
