package hackerRank;

class BinaryTree {

	static Node root;

	void printNumber(Node node, int min, int max) {

		if (node == null) {
			return;
		}

		if (min < node.data) {
			printNumber(node.leftD, min, max);
		}

		if (min <= node.data && max >= node.data) {
			System.out.print(node.data + " ");
		}

		if (max > node.data) {
			printNumber(node.rightD, min, max);
		}
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		int min = 5, max = 25;
		tree.root = new Node(30);
		tree.root.leftD = new Node(6);
		tree.root.rightD = new Node(23);
		tree.root.leftD.leftD = new Node(3);
		tree.root.leftD.rightD = new Node(13);

		tree.printNumber(root, min, max);
	}
}
