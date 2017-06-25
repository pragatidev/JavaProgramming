/**
 * 
 */
package com.leetcode;

/**
 * @author pkunwer
 *
 */
public class FirstUniqueCharinString {

	public static int firstUniqChar(String s) {
		char[] ch = new char[26];
		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			ch[index]++;
		}

		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			if (ch[index] == 1) {
				return i;
			}
		}

		return -1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "leetcode";
		int num = firstUniqChar(s);
		System.out.println(num);
	}

}
