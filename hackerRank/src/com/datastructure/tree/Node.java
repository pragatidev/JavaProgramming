/**
 * 
 */
package com.datastructure.tree;

/**
 * @author pkunwer
 *
 */
public class Node {

	private int data;
	private Node lTree;
	private Node rTree;

	/**
	 * @param data
	 */
	public Node(int data) {
		super();
		this.setData(data);
		lTree = null;
		rTree = null;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

}
