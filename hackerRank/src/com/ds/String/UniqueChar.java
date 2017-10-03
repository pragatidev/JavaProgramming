/**
 * 
 */
package com.ds.String;

/**
 * @author pkunwer Implement and
 *
 */
public class UniqueChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isUniqueChar(String str) {
		if (str.length() > 256)
			return false;

		boolean[] charMap = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int index = str.charAt(i);
			if (charMap[index])
				return false;

			charMap[index] = true;
		}
		return true;
	}

}
