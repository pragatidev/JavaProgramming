/**
 * 
 */
package com.exception;

import java.util.Scanner;

/**
 * @author pkunwer
 *
 */
public class ScanInt1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Type an integer in the console: ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("You typed Integer Value: " + scanner.nextInt());
	}

}
