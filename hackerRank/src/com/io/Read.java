/**
 * 
 */
package com.io;

import java.io.IOException;

/**
 * @author pkunwer
 *
 */
public class Read {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.print("Type a Character: ");
		int val = 0;
		try {
			val = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("You typed value: " + val);
	}

}
