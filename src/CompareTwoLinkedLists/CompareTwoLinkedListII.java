package CompareTwoLinkedLists;

import java.io.BufferedWriter;
import java.io.IOException;

public class CompareTwoLinkedListII {
    static class SinglyLinkedListNode {
        public int data;
        public CompareTwoLinkedListsI.SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public CompareTwoLinkedListsI.SinglyLinkedListNode head;
        public CompareTwoLinkedListsI.SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            CompareTwoLinkedListsI.SinglyLinkedListNode node = new CompareTwoLinkedListsI.SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(CompareTwoLinkedListsI.SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(CompareTwoLinkedListsI.SinglyLinkedListNode head1, CompareTwoLinkedListsI.SinglyLinkedListNode head2) {

        //traverse all of them
        //find if the nodes are the same

        //recursive

        if (head1== null && head2==null) return true;
        if (head1 == null && head2!=null) return false;
        if (head1 != null && head2== null) return false;
        if (head1.data != head2.data) return false;
        return compareLists(head1.next, head2.next);



    }
}
