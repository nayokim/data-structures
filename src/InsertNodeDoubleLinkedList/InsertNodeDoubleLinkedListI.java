package InsertNodeDoubleLinkedList;

import java.io.BufferedWriter;
import java.io.IOException;

public class InsertNodeDoubleLinkedListI {
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

    // Complete the sortedInsert function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {

        DoublyLinkedListNode nodeToInsert = new DoublyLinkedListNode(data);
        if (head == null) return nodeToInsert;
        DoublyLinkedListNode current = head;
        while (current != null) {
            if (data < current.data && current.prev == null) {
                current.prev = nodeToInsert;
                nodeToInsert.next = current;
                return nodeToInsert;
            }
            if (data >= current.data && current.next == null) {
                current.next = nodeToInsert;
                nodeToInsert.prev = current;
                break;
            }
            if (data >= current.data && data <= current.next.data) {
                DoublyLinkedListNode temp = current.next;
                current.next = nodeToInsert;
                nodeToInsert.prev = current;
                temp.prev = nodeToInsert;
                nodeToInsert.next = temp;
                break;
            }
            current = current.next;
        }
        return head;
    }
}
