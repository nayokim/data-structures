package ReverseDoubleLinkedList;

import java.io.BufferedWriter;
import java.io.IOException;

public class ReverseDoubleLinkedListI {
    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * (head) 1 - > 2 - > 3 -> 4 -> 5 (tail) single linked list
     *
     *
     * (head) 1 <- > 2 <- > 3 <-> 4 <-> 5 (tail) double linked list
     * (head) 5 <- > 4 <- > 3 <-> 2 <-> 1 (tail) double linked list
     * }
     *
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {


        if (head == null) return head;
        DoublyLinkedListNode currentNode = head;
        DoublyLinkedListNode newHead = head;

        while(currentNode != null){
            DoublyLinkedListNode prev = currentNode.prev;
            currentNode.prev = currentNode.next;
            currentNode.next = prev;
            newHead = currentNode;
            currentNode = currentNode.prev;
        }
        return newHead;




    }
}
