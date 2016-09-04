/**
 * 
 */
package com.linkedlist;

/**
 * @author pkunwer
 *
 */
public class RemoveValue {
	public Node deleteNode(Node head, int value){
		if (head == null)
			return null;
		Node pointer = head;
		while (pointer.next != null) {
			if (pointer.next.data == value)
				pointer.next = pointer.next.next;
			else
				pointer = pointer.next;
		}
		return head.data == value ? head.next : head;
	}

}
