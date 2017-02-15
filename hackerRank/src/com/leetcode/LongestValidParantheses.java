/**
 * 
 */
package com.leetcode;

import java.util.Stack;

/**
 * @author pkunwer
 *
 */
public class LongestValidParantheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "))))()()()(()))()";
		System.out.print(longestValidParentheses(str));
	}

	private static int longestValidParentheses(String s) {
		int count = 0;
		int maxCount = count;
		Stack<Integer> stck = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(') {
				stck.push(i);
			} else {
				if (!stck.empty() && s.charAt(stck.peek()) == '(') {
					stck.pop();

					int lastpos = -1;
					if (!stck.empty()) {
						lastpos = stck.peek();
					}

					int CurrCount = i - lastpos;
					maxCount = Math.max(maxCount, CurrCount);
				} else {
					stck.push(i);
				}
			}
		}
		return maxCount;
	}

}
