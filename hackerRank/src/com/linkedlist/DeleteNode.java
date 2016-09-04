/**
 * 
 */
package com.linkedlist;

/**
 * @author pkunwer
 *
 */
public class DeleteNode {
	public void deleteNode(Node node) {
		/**
		 * Best way to delete a node is to change the reference of that node
		 */
		node.data = node.next.data;
		node.next = node.next.next;
	}

}
