/**
 * 
 */
package com.leetcode;

/**
 * @author pkunwer
 * 
 *         Remove duplicate slashes
 *
 */
public class RemoveDuplicateslashes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "root//foo/bar";
		System.out.println(removeDupSlashes(str));
	}

	private static String removeDupSlashes(String str) {
		StringBuffer strbuf = new StringBuffer(str.length());
		for (int i = 0; i < str.length(); i++) {
			if (i > 0 && str.charAt(i) == '/' && str.charAt(i) == str.charAt(i - 1))
				continue;
			strbuf.append(str.charAt(i));
		}
		return strbuf.toString();
	}

}
