/**
 * 
 */
package com.sort;

/**
 * @author pkunwer
 *
 */
public class Book implements Comparable<Book> {

	private String title;
	private int isbn;

	/**
	 * @param title
	 * @param isbn
	 */
	public Book(String title, int isbn) {
		super();
		this.title = title;
		this.isbn = isbn;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the isbn
	 */
	public int getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn
	 *            the isbn to set
	 */
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Book o) {
		if (this.title.equals(o.title)) {
			return this.isbn - o.isbn;
		}

		return this.title.compareTo(o.title);
	}

}
