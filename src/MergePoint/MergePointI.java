package MergePoint;

import java.io.BufferedWriter;
import java.io.IOException;

public class MergePointI {
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

    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     * head 1 = 1 -> 2 -> 3 - > 7* - > 8;  length = 5
     * head 2 = 5 - > 6 -> 7 *-> 8;  length = 4
     * *where the two lists match is where they merge
     * if head 2 had length =5, you could loiop through and compare the two
     * however, the two have different lengths
     * Hashtable of seen values
     *
     * loop through both lists
     * head 1 = 1 -> 2 -> 3 - > 7 - > 8;
     head 2 = 5 - > 6 -> 7 -> 8;

     when you get to the end of both lists
     head 1 = 1 -> 2 -> 3 - > 7 - > 8 ->  5 - > 6 -> 7 -> 8; length = 9
     head 2 = 5 -> 6 -> 7 -> 8 -> 1 -> 2 -> 3 - > 7 - > 8; length = 9


     */

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode head1_current = head1;
        SinglyLinkedListNode head2_current = head2;

        while(head1_current != head2_current){
            //if they are different lengths
            if(head1_current.next == null){
                head1_current = head2;
            } else {
                head1_current = head1_current.next;
            }

            if (head2_current.next == null){
                head2_current = head1;
            } else {
                head2_current = head2_current.next;
            }

        }
        return head1_current.data;
    }
}
