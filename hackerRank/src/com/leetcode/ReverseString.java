/**
 * 
 */
package com.leetcode;

/**
 * @author pkunwer
 *
 */
public class ReverseString {

	public static void main(String args[]) {
		String str = "reverse";
		System.out.println(reverse(str));
	}

	private static String reverse(String str) {
		int len = str.length() - 1;
		StringBuffer buf = new StringBuffer(str.length());

		while (len >= 0) {
			buf.append(str.charAt(len--));
		}
		return buf.toString();
	}

}
