/**
 * 
 */
package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pkunwer
 *
 */
public class DupCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "dkjanfkjnkjanfknafmlamflkajgfja";
		str = dedup(str);
		System.out.println(str);
	}

	private static String dedup(String str) {

		Map map = new HashMap<>();
		StringBuffer strBuf = new StringBuffer(str.length());
		for (int i = 0; i < str.length(); i++) {
			if (!map.containsKey(str.charAt(i))) {
				strBuf.append(str.charAt(i));
				map.put(str.charAt(i), str.charAt(i));
			}
		}

		return strBuf.toString();
	}

}
