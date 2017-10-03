/**
 * 
 */
package com.leetcode;

import java.util.Stack;

/**
 * @author pkunwer Given an encoded string, return it's decoded string
 */
public class DecodeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "3[b2[ca]]";
		System.out.println("Decoded String is: " + decodeString(str));
		// output - bcacabcacabcaca
	}
	
	public static String decodeString(String s) {
        String res = "";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        int idx = 0;
        while (idx < s.length()) {
            if (Character.isDigit(s.charAt(idx))) {
                int count = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    count = 10 * count + (s.charAt(idx) - '0');
                    idx++;
                }
                countStack.push(count);
            }
            else if (s.charAt(idx) == '[') {
                resStack.push(res);
                res = "";
                idx++;
            }
            else if (s.charAt(idx) == ']') {
                StringBuilder temp = new StringBuilder (resStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                idx++;
            }
            else {
                res += s.charAt(idx++);
            }
        }
        return res;
    }

	private static String decode(String str) {
		String result = "";
		Stack<String> strStck = new Stack<>();
		Stack<Integer> numStack = new Stack<>();
		int i=0;
		while (i < str.length()) {

			if (Character.isDigit(str.charAt(i))) {
				int count = 0;
				while (Character.isDigit(str.charAt(i))) {
					count = count * 10 + (str.charAt(i) - '0');
					i++;
				}
				numStack.push(count);

			} else if (str.charAt(i) == '[') {
				strStck.push(result);
				result = "";
				i++;
			} else if (str.charAt(i) == ']' && !strStck.isEmpty()) {
				StringBuilder tempString = new StringBuilder(strStck.pop());
				int repeat = numStack.pop();
				for (int j = 0; j < repeat; j++) {
					tempString.append(result);
				}
				result = tempString.toString();
				i++;

			} else {
				result = result + str.charAt(i++);
				
			}
		}

		return result;
	}

}
