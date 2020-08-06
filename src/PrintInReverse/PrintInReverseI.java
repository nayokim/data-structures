package PrintInReverse;

import java.util.Stack;

public class PrintInReverseI {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    // Complete the reversePrint function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void reversePrint(SinglyLinkedListNode head) {
        if (head  == null ) return;

        Stack <SinglyLinkedListNode> stack = new Stack();
        SinglyLinkedListNode current = head;

        while (current != null){
            //loop through the list and add a node to the stack each time
            stack.push(current);
            current = current.next;
            //we are going to push nodes onto the stack. When we are done with the loop, we are going to pop it off, and now it is in reverse order!
        }

        while (!stack.isEmpty()){
            SinglyLinkedListNode node = stack.pop();
            System.out.println(node.data);
        }

    }
}
