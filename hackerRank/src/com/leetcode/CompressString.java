/**
 * 
 */
package com.leetcode;

/**
 * @author pkunwer Implement a method to perform basic string compression using
 *         the counts of repeated characters.
 *
 */
public class CompressString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "aabccccaaa";
		System.out.println(compressBetter(str));

	}

	private static String compress(String str) {
		int index = 0;
		StringBuilder newString = new StringBuilder();
		while (index < str.length()) {
			int count = 0;
			char ch = str.charAt(index);
			while (index < str.length() && str.charAt(index) == ch) {
				count++;
				index++;
			}

			newString = newString.append(ch).append(count);
		}
		if (str.length() <= newString.length())
			return str;
		return newString.toString();

	}

	/**
	 * using single loop and increasing count in 'if' and appending string in
	 * else block
	 * 
	 * @param str
	 * @return
	 */

	private static String compressBetter(String str) {

		char ch = str.charAt(0);
		int count = 1;
		int index = 1;
		StringBuilder newString = new StringBuilder();
		while (index < str.length()) {
			if (str.charAt(index) == ch) {
				count++;
			} else {
				newString.append(ch).append(count);
				ch = str.charAt(index);
				count = 1;
			}
			index++;
		}
		newString.append(ch).append(count);
		if (str.length() <= newString.length())
			return str;
		return newString.toString();

	}

}
