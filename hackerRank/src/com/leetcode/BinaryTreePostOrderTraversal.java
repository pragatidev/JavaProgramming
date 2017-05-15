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
public class BinaryTreePostOrderTraversal {

	public ArrayList<Integer> postorderTraversal(Tree root) {
		ArrayList<Integer> list = new ArrayList<>();

		if (root == null)
			return list;

		Stack<Tree> stck = new Stack<>();
		stck.push(root);
		Tree prev = null;
		while (!stck.empty()) {
			Tree current = stck.peek();
			if (prev == null || prev.left == current || prev.right == current) {
				if (current.left != null) {
					stck.push(current.left);
				} else if (current.right != null) {
					stck.push(current.right);
				} else {
					stck.pop();
					list.add(current.data);
				}
			} else if (current.left == prev) {
				if (current.right != null) {
					stck.push(current.right);
				} else {
					stck.pop();
					list.add(current.data);
				}
			} else if (current.right == prev) {
				stck.pop();
				list.add(current.data);
			}
			prev = current;

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
