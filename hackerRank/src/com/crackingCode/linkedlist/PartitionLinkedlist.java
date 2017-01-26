/**
 * 
 */
package com.crackingCode.linkedlist;

/**
 * @author pkunwer
 *
 */
public class PartitionLinkedlist {
	static Node head;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PartitionLinkedlist.head = new Node(9);
		PartitionLinkedlist.head.next = new Node(4);
		PartitionLinkedlist.head.next.next = new Node(5);
		PartitionLinkedlist.head.next.next.next = new Node(8);
		System.out.println("Elements before partition: ");
		printNode(head);
		partitionList(head, 6);

	}

	private static void partitionList(Node node, int val) {
		Node head = node;
		Node tail = node;

		while (node != null) {
			Node next = node.next;
			if (node.data < val) {
				node.next = head;
				head = node;
			} else {
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;
		printNode(head);
	}

	private static void printNode(Node node) {
		while (null != node) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
}
