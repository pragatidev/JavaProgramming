/**
 * 
 */
package com.leetcode;

/**
 * @author pkunwer Reverse a linked list
 *
 */
public class ReverseList {
	private static Node head;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		head = new Node(10);
		head.next = new Node(5);
		head.next.next = new Node(6);
		head.next.next.next = new Node(9);
		printList(head);
		System.out.println();
		Node reverse = reverseList(head);
		printList(reverse);
	}

	private static void printList(Node list) {
		while (list != null) {
			System.out.print(list.data + " ");
			list = list.next;
		}
	}

	private static Node reverseList(Node list) {
		Node current = list;
		Node prev = null;
		Node next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

}
