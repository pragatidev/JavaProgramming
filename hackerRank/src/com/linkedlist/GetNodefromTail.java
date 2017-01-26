package com.linkedlist;

public class GetNodefromTail {
	static Node head;
	
	public static void main (String args[]){
		GetNodefromTail list = new GetNodefromTail();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(2);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		list.head.next.next.next.next.next = new Node(6);
		list.head.next.next.next.next.next.next = new Node(7);
		list.head.next.next.next.next.next.next.next = new Node(8);

		System.out.println("Original Linked list is :");
		list.printList(head);
		
		int result = GetNode(head, 3);
		System.out.println(result);
	}
	
	// prints content of double linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	
	private static int GetNode(Node head, int n){
		
		Node firstpointer = head;
		Node secPointer = head;
		int count = 0;
		
		while (firstpointer != null){
			firstpointer = firstpointer.next;
			if( count++ >= n){
				secPointer = secPointer.next;
			}
		}
		
		return secPointer.data;

	    
	}

}
