package TreePostorderTraversal;


import java.util.Scanner;

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}


public class TreePostorderTraversalI {
    public static void postOrder(Node root) {
//postorder = left, right, root

        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);

        System.out.print(root.data);

//        System.out.println(root.left);
//        System.out.println(root.right);
//        System.out.println(root.data + " ");


    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        postOrder(root);
    }
}

