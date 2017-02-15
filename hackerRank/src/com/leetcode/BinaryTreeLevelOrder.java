/**
 * 
 */
package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author pkunwer
 *
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class BinaryTreeLevelOrder {
	public List<List<Integer>> levelOrder(Tree root) {

		List<List<Integer>> list = new LinkedList();

		if (root == null)
			return list;

		Queue<Tree> queue = new LinkedList();
		queue.add(root);

		while (!queue.isEmpty()) {
			int levelSize = queue.size();
			List<Integer> levelList = new LinkedList();

			while (levelSize > 0) {
				Tree node = queue.peek();
				levelList.add(levelSize--, node.data);

				if (node.left != null) {
					queue.add(node.left);
				}

				if (node.right != null) {
					queue.add(node.right);
				}

				queue.poll();
				levelSize--;
			}
			list.add(levelList);

		}

		return list;

	}
}