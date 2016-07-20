/**
 * 
 */
package com.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author pkunwer
 *
 */
public class ModifyingList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> aList = new ArrayList<String>();
		aList.add("One");
		aList.add("Two");
		aList.add("Three");

		Iterator<String> listIterator = aList.iterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
			aList.add("Four");
		}

	}

}
