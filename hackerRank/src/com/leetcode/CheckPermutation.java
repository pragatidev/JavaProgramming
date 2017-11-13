/**
 * 
 */
package com.leetcode;

import java.util.Arrays;

/**
 * @author pkunwer
 * 
 *         Given two strings, write a method to decide if one is a permutation
 *         of the other.
 *
 */
public class CheckPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "dbce";
		System.out.println(checkPermute(str1, str2));

	}

	private static boolean checkPermute(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		
		return sort(str1).equals(sort(str2));
	}

	private static String sort(String str) {
		char[] content = str.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

}
