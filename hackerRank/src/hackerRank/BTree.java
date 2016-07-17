package hackerRank;

class Node {

    int data;
    Node leftD, rightD;

    Node(int d) {
        data = d;
        leftD = null;
        rightD=null;
    }
}

class BTree {

    static Node root;


    void Print(Node node, int min, int max) {

        if (node == null) {
            return;
        }


        if (min < node.data) {
            Print(node.leftD, min, max);
        }


        if (min <= node.data && max >= node.data) {
            System.out.print(node.data + " ");
        }


        if (max > node.data) {
            Print(node.rightD, min, max);
        }
    }


    public static void main(String[] args) {
        BTree tree = new BTree();
        int min = 5, max = 25;
        tree.root = new Node(30);
        tree.root.leftD = new Node(6);
        tree.root.rightD = new Node(23);
        tree.root.leftD.leftD = new Node(3);
        tree.root.leftD.rightD = new Node(13);

        tree.Print(root, min, max);
    }
}

