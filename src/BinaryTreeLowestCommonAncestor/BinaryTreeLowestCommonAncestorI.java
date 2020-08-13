package BinaryTreeLowestCommonAncestor;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryTreeLowestCommonAncestorI {
    //in this case, the tree is made for us
    public static Node lca(Node root, int v1, int v2) {
        // the bigger values are on the right and the smaller values are found on the left

        //if our values are bigger than the roots value, we will traverse on the right.
        if (v1 > root.data && v2> root.data){
            return lca (root.right, v1, v2);
        }

        // If its smaller, we will traverse on the left.
        if (v2< root.data && v1 < root.data){
            return lca (root.left, v1, v2);
        }
        // this means that these particular conditions werent hit so this is sort of "catch all"
        // Else solution already found
        return root;
    }


    // insert a node
    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
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
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root,v1,v2);
        System.out.println(ans.data);
    }
}
