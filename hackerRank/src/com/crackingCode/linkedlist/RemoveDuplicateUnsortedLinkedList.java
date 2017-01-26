/**
 * 
 */
package com.crackingCode.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pkunwer Write a program to remove duplicates from and Unsorted Linked
 *         List
 *
 */
public class RemoveDuplicateUnsortedLinkedList {

	static Node head;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RemoveDuplicateUnsortedLinkedList.head = new Node(3);
		RemoveDuplicateUnsortedLinkedList.head.next = new Node(3);
		RemoveDuplicateUnsortedLinkedList.head.next.next = new Node(6);
		System.out.print("List element before updates: ");
		printNode(head);
		findDuplicateandDelete(RemoveDuplicateUnsortedLinkedList.head);
		System.out.println("List element after updates: ");
		printNode(head);
	}

	private static void findDuplicateandDelete(Node node) {
		List<Integer> arr = new ArrayList<>();
		Node current = node;
		Node prev = node;

		while (current != null) {
			if (arr.contains(current.data)) {
				prev.next = current.next;
				prev = current;

			} else {
				prev = current;
				arr.add(current.data);
			}

			if (current.next != null)
				current = current.next;
			else
				break;
		}
		System.out.print(node.data);

	}

	private static void printNode(Node node) {
		while (null != node) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

}
