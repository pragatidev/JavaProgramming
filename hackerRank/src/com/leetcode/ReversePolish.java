/**
 * 
 */
package com.leetcode;

import java.util.Stack;

/**
 * @author pkunwer 
 * Evaluate the value of an arithmetic expression in Reverse
 *         Polish Notation. Valid operators are +, -, *, /. Each operand
 *
 *         Problem will be solve using stack
 */
public class ReversePolish {

	static int evalReversePN(String[] tokens) {
		Stack<String> stack = new Stack<>();
		String operators = "+-*/";
		for (String t : tokens) {
			if (!operators.contains(t)) {
				stack.push(t);
			} else {
				int num1 = Integer.valueOf(stack.pop());
				int num2 = Integer.valueOf(stack.pop());

				switch (t) {
				case "+":
					stack.push(String.valueOf(num1 + num2));
					break;

				case "-":
					stack.push(String.valueOf(num2 - num1));
					break;

				case "*":
					stack.push(String.valueOf(num1 * num2));
					break;

				case "/":
					stack.push(String.valueOf(num2 / num1));
					break;

				default:
					break;
				}
			}

		}

		return Integer.valueOf(stack.pop());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] tokens = { "2", "1", "+", "3", "*" };
		System.out.println(evalReversePN(tokens));
	}

}
