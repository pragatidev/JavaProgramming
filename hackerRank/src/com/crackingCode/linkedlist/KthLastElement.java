/**
 * 
 */
package com.crackingCode.linkedlist;

/**
 * @author pkunwer
 *
 */
public class KthLastElement {

	static Node head;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KthLastElement.head = new Node(3);
		KthLastElement.head.next = new Node(4);
		KthLastElement.head.next.next = new Node(2);
		System.out.print("List element before updates: ");
		printNode(head);
		kthlastelement(KthLastElement.head, 3);
		

	}

	private static void kthlastelement(Node node, int pos) {
		Node firstPointer = node;
		Node secPointer = node;

		for (int i = 1; i < pos; i++) {
			if (firstPointer.next != null)
				firstPointer=firstPointer.next;
		}
		while (firstPointer.next != null) {
			firstPointer = firstPointer.next;
			secPointer = secPointer.next;
		}
		System.out.print(secPointer.data);

	}

	private static void printNode(Node node) {
		while (null != node) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

}
