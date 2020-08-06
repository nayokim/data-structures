package InsertNodeAtLL;

import java.io.BufferedWriter;
import java.io.IOException;

public class InsertNodeAtLLI {
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

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

        //this is the new node that is going to be placed at position  position
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        //this is the head node reference
        SinglyLinkedListNode current = head;

        SinglyLinkedListNode previous;

        for (int i = 0; i < position-1; i++) {
            current = current.next;
        }

        SinglyLinkedListNode temp = current.next;
        current.next = newNode;
        newNode.next = temp;

        return head;

    }
    public static void main(String[] args) {

    }
}
