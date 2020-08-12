package HeightOfBinaryTree;

//height of a binary tree is the number of edges from the root to the deepest leaf of the tree

// a Binary tree node
class Node {
    int data;
    Node left, right;

    Node (int item){
        data = item;
        left = right = null;
    }
}

public class HeightOfTreeI {

    public static int height(Node root) {
        // Write your code here.
        if (root == null){
            return -1;
        }

        return  (1 + Math.max(height(root.left), height(root.right)));
    }

    public static void main(String[] args) {
        Node root = null;

        root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

        System.out.print("The height of the binary tree is " + height(root));
    }
}
