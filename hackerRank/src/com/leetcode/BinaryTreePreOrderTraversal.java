/**
 * 
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author pkunwer
 *
 */
public class BinaryTreePreOrderTraversal {

	public ArrayList<Integer> preOrderTraversal(Tree root) {
		ArrayList<Integer> rList = new ArrayList<>();

		if (root == null)
			return rList;

		Stack<Tree> stck = new Stack<>();
		stck.push(root);
		while (!stck.isEmpty()) {
			Tree node = stck.pop();
			rList.add(node.data);
			if (node.right != null) {
				stck.push(node.right);
			}

			if (node.left != null) {
				stck.push(node.left);
			}
		}
		return rList;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
