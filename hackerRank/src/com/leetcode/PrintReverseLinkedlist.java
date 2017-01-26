/**
 * 
 */
package com.leetcode;

import java.util.Stack;

/**
 * @author pkunwer
 * print all the data in reverse order without affecting linked list
 *
 */
public class PrintReverseLinkedlist {
	private static Node head;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node node = new Node(1);
		head = node;
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		
		printrecReverse(head);
		printiterReverse(head);
	}
	
	// Time Complexity O(n), Space Complexity: if remove space taken in recursive processing O(1)
	private static void printrecReverse(Node node){
		if (node == null)
			return ;
		
		printrecReverse(node.next);
		System.out.print(node.data+" ");
	}
	
	//Iterative solution, Time Complexity O(n), Space COmplexity: O(n)
	private static void printiterReverse(Node node){
		
		Node temp = node;
		Stack stack =  new Stack<>();
		
		while (temp != null){
			stack.push(temp.data);
			temp = temp.next;
		}
		
		while (!stack.isEmpty()){
			System.out.print(stack.pop()+ " ");
		}
	}
	

}

class Node {
	int data;
	Node next;
	
	public Node(int val){
		data = val;
		next = null;
	}
}
