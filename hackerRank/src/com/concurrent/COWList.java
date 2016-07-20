/**
 * 
 */
package com.concurrent;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author pkunwer
 *
 */
public class COWList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> aList = new CopyOnWriteArrayList<String>();
		aList.add("one");
		aList.add("two");
		aList.add("three");
		Iterator<String> listIter = aList.iterator();
		while (listIter.hasNext()) {
			System.out.println(listIter.next());
			aList.add("four");
		}
	}

}
