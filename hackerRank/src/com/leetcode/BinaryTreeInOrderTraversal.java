/**
 * 
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author pkunwer
 *
 */
public class BinaryTreeInOrderTraversal {

	public ArrayList<Integer> inorderTraversal(Tree root) {
		ArrayList<Integer> list = new ArrayList<>();
		if (root == null)
			return list;

		Stack<Tree> stck = new Stack<>();
		Tree node = root;
		stck.push(node);
		while (!stck.isEmpty() || node != null) {
			if (node != null) {
				node = node.left;
				stck.push(node);
			} else {
				node = stck.pop();
				list.add(node.data);
				node = node.right;
			}
		}
		return list;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
