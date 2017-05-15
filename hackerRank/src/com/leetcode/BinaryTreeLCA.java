/**
 * 
 */
package com.leetcode;

/**
 * @author pkunwer
 *
 */
public class BinaryTreeLCA {

	public Tree lowestCommonAncestor(Tree root, Tree p, Tree q) {

		Tree node = root;
		if (node != null) {
			if (p.data < root.data && q.data < root.data) {
				node = lowestCommonAncestor(root.left, p, q);
			} else if (p.data > root.data && q.data > root.data) {
				node = lowestCommonAncestor(root.right, p, q);
			} else {
				return node;
			}
		}
		return node;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
