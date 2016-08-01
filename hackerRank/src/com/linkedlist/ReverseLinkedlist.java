package com.linkedlist;

public class ReverseLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// This is a "method-only" submission.
	// You only need to complete this method.
	Node Reverse(Node head) {
		if (null == head)
			return head;
		else {
			Node prev = null;
			Node current = head;
			Node next = null;

			while (null != current) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			head = prev;
			return head;
		}
	}

	void printList(Node node) {
		while (null != node) {
			System.out.println(node.data + " ");
			node = node.next;
		}
	}

}
