/**
 * 
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pkunwer Given a string s and a dictionary of words dict, determine if
 *         s can be segmented into a space-separated sequence of one or more
 *         dictionary words. For example, given s = “leetcode”, dict = ["leet",
 *         "code"]. Return true because “leetcode” can be segmented as “leet
 *         code”
 *
 */
public class WordBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> dict = new ArrayList<>();
		dict.add("leet");
		dict.add("code");
		String word = "leetcode";
		boolean flag = isWordExists(dict, word);
		System.out.print("is word Exists? " + flag);
	}

	private static boolean isWordExist(String[] dict, String word) {
		int length = word.length();
		List<String> dicts = Arrays.asList(dict);

		for (int i = 0; i < length; i++) {
			if (dicts.contains(word.substring(i, length)) && dicts.contains(word.substring(0, i))) {
				System.out.println(i);
				return true;
			}

		}

		return false;
	}

	private static boolean isWordExists(List<String> dict, String word) {
		int length = word.length();
		boolean[] visited = new boolean[length + 1];
		visited[0] = true;

		for (int i = 0; i <= length; i++) {
			for (int j = 0; j < i; j++) {
				if (visited[j] && dict.contains(word.substring(j, i))) {
					visited[i] = true;
				}
			}
		}

		return visited[length];
	}

}
