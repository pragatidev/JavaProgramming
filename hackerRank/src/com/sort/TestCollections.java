/**
 * 
 */
package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author pkunwer
 *
 */
public class TestCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Patterns", 12345));
		books.add(new Book("Patterns", 34567));
		books.add(new Book("Examples", 23456));

		Collections.sort(books);
	}

}
