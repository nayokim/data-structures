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

}
