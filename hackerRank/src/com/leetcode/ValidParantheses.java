/**
 * 
 */
package com.leetcode;

import java.util.Stack;

/**
 * @author pkunwer
 *
 */
public class ValidParantheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "[{()}]";
		// String open = "[{(";

		System.out.println(isValidParantheses(str));
	}

	private static boolean isValidParantheses(String s) {
		Stack<Character> stck = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '[' || ch == '{' || ch == '(') {
				stck.push(ch);
			} else if (ch == ']' && !stck.isEmpty() && stck.peek() == '[') {
				stck.pop();
			} else if (ch == '}' && !stck.isEmpty() && stck.peek() == '{') {
				stck.pop();
			} else if (ch == ')' && !stck.isEmpty() && stck.peek() == '(') {
				stck.pop();
			} else {
				return false;
			}
		}

		System.out.println("End of loop");

		return stck.isEmpty();

	}

}
