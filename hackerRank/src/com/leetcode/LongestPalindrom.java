/**
 * 
 */
package com.leetcode;

/**
 * @author pkunwer
 *
 */
public class LongestPalindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "arbschdhfsmalayalamjfoisjhfs";
		System.out.println(longestPalindrome(str));

	}

	private static String longestPalindrome(String str) {
		if (str == null)
			return str;
		if (str.length() <= 1)
			return str;

		String longest = str.substring(0, 1);
		for (int i = 0; i < str.length(); i++) {
			String tmp = helper(str, i, i);
			if (tmp.length() > longest.length())
				longest = tmp;

			tmp = helper(str, i, i + 1);
			if (tmp.length() > longest.length())
				longest = tmp;

		}
		return longest;
	}

	private static String helper(String str, int begin, int end) {
		while (begin >= 0 && end <= str.length() - 1 && str.charAt(begin) == str.charAt(end)) {
			begin--;
			end++;
		}
		return str.substring(begin + 1, end);
	}

}
