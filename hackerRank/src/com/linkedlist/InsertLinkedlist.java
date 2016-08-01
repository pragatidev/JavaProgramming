package com.linkedlist;

public class InsertLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Node insert(Node head, int data) {
		// Complete this method
		if (null == head) {
			head = new Node(data);
			head.next = null;
			return head;
		} else {
			Node nextNode = head;
			while (null != nextNode.next) {
				nextNode = nextNode.next;
			}
			Node newNode = new Node(data);
			nextNode.next = newNode;
			newNode.next = null;
			return head;
		}

	}

}

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}
