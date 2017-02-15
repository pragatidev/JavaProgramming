/**
 * 
 */
package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author pkunwer
 *
 */
public class BinaryTreeBFS {
	private static Tree root;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tree btree = new Tree(1);
		btree.left = new Tree(2);
		btree.right = new Tree(5);
		btree.left.left = new Tree(4);

		root = btree;

		levelOrder(root);

	}

	// BFS Travel
	private static void levelOrder(Tree node) {
		if (node == null)
			return;

		Queue<Tree> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {

			int Levelsize = queue.size();

			while (Levelsize > 0) {
				Tree current = queue.peek();
				System.out.print(current.data + " ");
				if (current.left != null)
					queue.add(current.left);

				if (current.right != null)
					queue.add(current.right);

				queue.poll();
				Levelsize--;
			}
			System.out.println();
		}
	}

	private static Tree Delete(Tree node, int data) {

		return root;
	}

}


