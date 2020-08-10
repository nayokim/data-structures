package CompareTwoLinkedLists;

import java.io.BufferedWriter;
import java.io.IOException;

public class CompareTwoLinkedListsI {
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
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        //traverse all of them
        //find if the nodes are the same

        //iteration
        if (head1 == null && head2 == null) return true;

        SinglyLinkedListNode firstRunner = head1;
        SinglyLinkedListNode secondRunner = head2;
        while (firstRunner != null && secondRunner != null) {
            if (firstRunner.data != secondRunner.data){
                break;
            }
            if (firstRunner.next == null && secondRunner.next == null){
                return true;
            }
            firstRunner = firstRunner.next;
            secondRunner = secondRunner.next;
        }
        return false;




    }
}
