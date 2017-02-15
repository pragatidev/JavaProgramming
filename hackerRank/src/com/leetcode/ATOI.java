/**
 * 
 */
package com.leetcode;

/**
 * @author pkunwer Implement atoi to convert a string to an integer .
 *
 */
public class ATOI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "-12367";
		System.out.println(atoi(str));

	}

	private static double atoi(String str) {
		if (str == null || str.length() < 1)
			return 0;

		str = str.trim();

		int i = 0;
		char sign = '+';

		if (str.charAt(i) == '-') {
			sign = '-';
			i++;
		} else if (str.charAt(i) == '+') {
			i++;
		}

		double result = 0;

		while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			result = result * 10 + (str.charAt(i) - '0');
			i++;
		}

		if (sign == '-')
			result = -result;

		if (result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;

		if (result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		return result;
	}

}
