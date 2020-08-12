package TreeLevelOrderTraversal;

import java.sql.SQLOutput;
import java.util.LinkedList;
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

public class LevelOrderTraversalI {
    public static void levelOrder(Node root) {
        if (root == null){
            return;
        }

        //recursive does nto work here - this will go traverse all the nodes on the left then all the ones on the right. we do not want this.

//        levelOrder(root.left);
//        levelOrder(root.right);

        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            //left node in the queue then right node in the queue. Left right left right left right, level by level
            Node currentNode = queue.poll();

            System.out.print(currentNode.data + " ");

            if (currentNode.left != null){
                queue.add(currentNode.left);
            }
            if (currentNode.right!=null){
                queue.add(currentNode.right);
            }
        }


//        Node node = root;
//        LinkedList<Node> queue = new LinkedList<Node>();
//        queue.add(node);
//        while (queue.size() != 0)
//        {
//            int s = queue.poll().data;
//            System.out.print(s + " ");
//
//            if(node.left != null) {
//                queue.add(node.left);
//            }
//
//            if(node.right != null) {
//                queue.add(node.right);
//            }
//            node = queue.peek();
//        }


    }

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
        scan.close();
        levelOrder(root);
    }

}
