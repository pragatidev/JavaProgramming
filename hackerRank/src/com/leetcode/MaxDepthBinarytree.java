/**
 * 
 */
package com.leetcode;

/**
 * @author pkunwer
 *
 */
public class MaxDepthBinarytree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public static int maxDepth(Tree root) {

		int lDepth = 0, rDepth = 0;

		if (root == null)
			return 0;

		if (root.left == null && root.right == null)
			return 1;

		if (root.left != null) {
			lDepth = maxDepth(root.left) + 1;

		}

		if (root.right != null) {
			rDepth = maxDepth(root.right) + 1;
		}

		if (lDepth > rDepth) {
			return lDepth;
		} else
			return rDepth;

	}

}
