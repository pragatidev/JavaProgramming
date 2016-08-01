package com.linkedlist;

public class CompareList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int CompareLists(Node headA, Node headB) {
		Node node1 = headA;
		Node node2 = headB;

		while (null != node1 && null != node2) {
			if (node1.data != node2.data)
				return 0;
			node1 = node1.next;
			node2 = node2.next;
		}
		if (null != node1 || null != node2)
			return 0;
		else
			return 1;

	}

}
