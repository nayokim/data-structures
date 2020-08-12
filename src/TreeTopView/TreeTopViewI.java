package TreeTopView;

import java.util.Stack;

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

public class TreeTopViewI {
    public static void topView(Node root) {
        Node curr = root;
        Stack<Node> stack = new Stack<Node>();
        while(curr != null) {
            stack.push(curr);
            curr = curr.left;
        }

        while(!stack.isEmpty()){
            Node node = stack.pop();
            System.out.print(node.data + " ");
        }

        curr = root.right;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.right;
        }

    }


}

