/**
 * 
 */
package com.crackingCode.linkedlist;

/**
 * @author pkunwer
 *
 */
public class RemoveDupswithoutStorage {

	static Node head;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RemoveDupswithoutStorage.head = new Node(3);
		RemoveDupswithoutStorage.head.next = new Node(6);
		RemoveDupswithoutStorage.head.next.next = new Node(6);
		System.out.print("List element before updates: ");
		printNode(head);
		findDuplicateandDelete(RemoveDupswithoutStorage.head);
		System.out.println("List element after updates: ");
		printNode(head);
	}

	private static void findDuplicateandDelete(Node node) {
		Node current = node;
		Node prev = node;
		Node next;

		while (current != null) {
			prev = current;
			if (current.next != null) {
				next = current.next;
				while (current.data == next.data && prev.next != null) {
					if (next.next != null) {
						prev.next = next.next;
						prev = next;
						next = next.next;
					} else {
						prev.next = null;
						break;
					}

				}
			}

			if (current.next != null)
				current = current.next;
			else
				current = null;
		}


	}

	private static void printNode(Node node) {
		while (null != node) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

}
