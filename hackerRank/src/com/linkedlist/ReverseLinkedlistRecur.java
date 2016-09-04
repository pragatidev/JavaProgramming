/**
 * 
 */
package com.linkedlist;

/**
 * @author pkunwer
 *
 */
public class ReverseLinkedlistRecur {

	static Node head;

	Node reverse(Node head) {

		/*
		 * We have two conditions in this if statement. This first condition
		 * immediately returns null when the list is null. The second condition
		 * returns the final node in the list. That final node is sent into the
		 * "remaining" Node below.
		 * -----------------------------------------------------
		 */

		if (head == null || head.next == null) {
			return head;
		}

		/*
		 * When the recursion creates the stack for A -> B -> C
		 * (RevA(RevB(RevC()))) it will stop at the last node and the recursion
		 * will end, beginning the unraveling of the nested functions from the
		 * inside, out. -----------------------------------------------------
		 */

		Node remaining = reverse(head.next);

		/*
		 * Now we have the "remaining" node returned and accessible to the node
		 * prior. This remaining node will be returned by each function as the
		 * recursive stack unravels.
		 * 
		 * Assigning head to head.next.next where A is the head and B is after
		 * A, (A -> B), would set B's pointer to A, reversing their direction to
		 * be A <- B. -----------------------------------------------------
		 */

		head.next.next = head;

		/*
		 * Now that those two elements are reversed, we need to set the pointer
		 * of the new tail-node to null.
		 * -----------------------------------------------------
		 */

		head.next = null;

		/*
		 * Now we return remaining so that remaining is always reassigned to
		 * itself and is eventually returned by the first function call.
		 * -----------------------------------------------------
		 */

		return remaining;
	}

	public static void main(String[] args) {
		ReverseLinkedlistRecur list = new ReverseLinkedlistRecur();
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
		Node res = list.reverse(head);
		System.out.println("");
		System.out.println("");
		System.out.println("Reversed linked list : ");
		list.printList(res);
	}

	// prints content of double linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

}
