package com.linkedlist;

public class ReverseLinkedlist {
	static Node head;

	public static void main(String[] args) {

		ReverseLinkedlist.head = new Node(63);
		ReverseLinkedlist.head.next = new Node(32);
		ReverseLinkedlist.head.next.next = new Node(10);
		ReverseLinkedlist.head.next.next.next = new Node(16);

		System.out.println("Original linked list is: ");
		printList(head);
		System.out.println(" ");
		head = Reverse(head);
		System.out.println("Reversed linked list is: ");
		printList(head);

	}

	static Node Reverse(Node node) {
		if (null == node)
			return node;
		else {
			Node prev = null;
			Node current = node;
			Node next = null;

			while (null != current) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}

			return prev;
		}
	}

	static void printList(Node node) {
		while (null != node) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

}
