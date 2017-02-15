/**
 * 
 */
package com.leetcode;

/**
 * @author pkunwer
 * 
 *         Minimum depth of a binary tree
 *
 */
public class BinaryTreeMinDepth {
	private static Tree root;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	private static int minDepth(Tree root) {
		int minDepth = 0;
		if (root == null)
			return 0;

		if (root.left == null && root.right == null)
			return 1;

		if (root.left == null)
			return minDepth(root.right) + 1;

		if (root.right == null)
			return minDepth(root.left) + 1;

		return Math.min(minDepth(root.left), minDepth(root.right)) + 1;

	}

}
