/**
 * 
 */
package com.ds.tree;

/**
 * @author pkunwer
 *
 */
public class BinaryTree {

	private Node root;

	private static class Node {
		int data;
		Node left;
		Node right;

		Node(int newData) {
			left = null;
			right = null;
			data = newData;
		}
	}

	/**
	 * An empty Binary Tree
	 */
	public BinaryTree() {
		root = null;
	}

	public boolean lookup(int data) {
		return lookup(root, data);
	}

	/**
	 * Recursive lookup, give a node, recur down for a data
	 * 
	 * @param node
	 * @param data
	 * @return
	 */
	public boolean lookup(Node node, int data) {
		if (node == null)
			return false;

		if (data == node.data)
			return true;
		else if (data < node.data) {
			return lookup(node.left, data);
		} else {
			return lookup(node.right, data);
		}

	}

	public void insert(int data) {
		root = insert(root, data);
	}

	/**
	 * Recursive Insert
	 * 
	 * @param node
	 * @param data
	 * @return
	 */
	private Node insert(Node node, int data) {
		if (node == null)
			node = new Node(data);
		else {
			if (data <= node.data)
				node.left = insert(node.left, data);
			else
				node.right = insert(node.right, data);
		}

		return node;
	}

	/**
	 * Build a 123 tree
	 */
	public void build123() {
		root = new Node(2);
		root.left = new Node(1);
		root.right = new Node(3);
	}

	/**
	 * size of the tree
	 */
	@SuppressWarnings("unused")
	private int size(Node node) {
		if (node == null)
			return 0;
		else
			return size(node.left) + 1 + size(node.right);
	}

	/**
	 * Max Depth of the Tree - Returns Max root-to-leaf depth of the tree. Uses
	 * a recursive method to recur down to find the max depth
	 */
	@SuppressWarnings("unused")
	private int maxDepth(Node node) {
		if (node == null)
			return 0;
		if (maxDepth(node.left) >= maxDepth(node.right))
			return maxDepth(node.left) + 1;
		else
			return maxDepth(node.right) + 1;
	}

	/**
	 * MinValue - Returns the minimum value in a non-empty binary search tree.
	 * 
	 */
	@SuppressWarnings("unused")
	private int minValue(Node node) {
		if (node.left == null)
			return node.data;
		else
			return minValue(node.left);
	}

	/**
	 * MaxValue - Returns the maximum value in a non-empty binary search tree.
	 * 
	 */
	@SuppressWarnings("unused")
	private int maxValue(Node node) {
		if (node.right == null)
			return node.data;
		else
			return maxValue(node.right);
	}

	/**
	 * InOrder Tree traversal - Print data
	 * 
	 * @param node
	 */
	@SuppressWarnings("unused")
	private void printInorder(Node node) {
		if (node == null)
			return;
		printInorder(node.left);
		System.out.print(node.data + " ");
		printInorder(node.right);
	}

	/**
	 * Post Order Traversal - print data
	 * 
	 * @param node
	 */
	@SuppressWarnings("unused")
	private void printPostorder(Node node) {
		if (node == null)
			return;
		printPostorder(node.left);
		printPostorder(node.right);

		System.out.print(node.data + " ");

	}

	/**
	 * Pre Order Traversal - print data
	 * 
	 * @param node
	 */
	@SuppressWarnings("unused")
	private void printPreorder(Node node) {
		if (node == null)
			return;

		System.out.print(node.data + " ");
		printPreorder(node.left);
		printPreorder(node.right);
	}

	/**
	 * Tests if a tree meets the conditions to be a binary search tree (BST)
	 */
	public boolean isBST1() {
		return isBST(root);
	}

	private boolean isBST(Node node) {
		if (node == null)
			return true;
		if (node.left != null && maxValue(node.left) > node.data)
			return false;
		if (node.right != null && minValue(node.right) <= node.data)
			return false;
		return isBST(node.left) && isBST(node.right);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
