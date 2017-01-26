/**
 * 
 */
package com.leetcode;

/**
 * @author pkunwer
 * 
 *         Implement pow(x,n)
 *
 */
public class Power {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public static double power(double x, int n) {
		if (x == 0)
			return 0;
		if (n == 0)
			return 1;

		double result = 1;
		for (int i = 0; i <= n; i++) {
			result = result * x;
		}

		return result;

	}

	/**
	 * Most Understandable solution
	 */

	public double power2(double base, int num) {
		if (num == 0)
			return 1;

		double val = power2(base, num / 2);
		if (num % 2 == 0)
			return val * val;
		else
			return base * val * val;

	}

	public double pow(double x, int n) {
		if (n < 0)
			return 1 / power2(x, -n);
		else
			return 1 / power2(x, n);
	}
}
