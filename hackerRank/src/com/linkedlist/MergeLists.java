/**
 * 
 */
package com.linkedlist;

/**
 * @author pkunwer
 *
 */
public class MergeLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Node MergeList(Node headA, Node headB) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method 
		Node node1 = headA;
		Node node2 = headB;
		Node head = null;
		
		while (null != node1.next && null != node2.next){
			if (node1.data < node2.data){
				node1 = node1.next;
			} 
		}
		
		return head;

	}
}
