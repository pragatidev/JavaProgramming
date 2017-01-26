/**
 * 
 */
package com.crackingCode.linkedlist;

/**
 * @author pkunwer
 *
 */
public class DeleteElement {
	static Node head;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DeleteElement.head = new Node(3);
		DeleteElement.head.next = new Node(4);
		DeleteElement.head.next.next = new Node(5);
		deleteGivenElement(head);
		
	}
	
	private static void deleteGivenElement(Node node){
		if (node == null )
			return;
		
		if (node.next!= null){
			node.data = node.next.data;
			node.next = node.next.next;
		}
		
	}

}
