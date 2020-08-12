//package TreePreorderTraveral;
//
//import java.util.Stack;
//
//class Node {
//    Node left;
//    Node right;
//    int data;
//
//    Node(int data) {
//        this.data = data;
//        left = null;
//        right = null;
//    }
//}
//public class PreorderTraversal {
//    /* you only have to complete the function given below.
//Node is defined as
//
//class Node {
//    int data;
//    Node left;
//    Node right;
//}
//
//preorder - root -> left ->right
//in order - left -> root - > right
//postorder - left -> right -> root
//
//*/
//
//    public static void preOrder(Node root) {
//
//        if (root == null){
//            return;
//        }
//
//        //recursive
//        System.out.println(root.data + " ");
//        preOrder(root.left);
//        preOrder(root.right);
//
//        //iterative
//        Stack <Node> stack = new Stack();
//        stack.add(root);
//
//        while (!stack.isEmpty()){
//            Node currentNode = stack.pop();
//            System.out.println(currentNode.data + " ");
//            if (currentNode.right != null){
//                stack.add(currentNode.right);
//            }
//            if (currentNode.left != null){
//                stack.add(currentNode.left);
//            }
//        }
//    }
//
//}
