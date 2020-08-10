package MergeTwoLinkedLists;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MergeTwoLinkedListsI {



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

        // Complete the mergeLists function below.

        /*
         * For your reference:
         *
         * SinglyLinkedListNode {
         *     int data;
         *     SinglyLinkedListNode next;
         * }
         *
         */
        static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
            //check if list exists
            if (head1 == null) return head2;
            if(head2 == null) return head1;

            //1,2,3, +
            //1,2,3 -> 1,2,3,1,2,3 is incorrect!
            //loop through each list simultaneously and do checks and put the smaller one in.

            //create a new list
            SinglyLinkedListNode head3= null;

            //loop through each list simultaneously
            if (head1.data < head2.data){
                head3 = head1;
                head1 = head1.next;
            } else {
                head3 = head2;
                head2 = head2.next;
            }

            //keep reference to head 3
            SinglyLinkedListNode current = head3;

            //check which values are smaller. Smaller one goes into the list
            while (head1 !=null && head2 !=null){
                if (head1.data < head2.data){
                    current.next = head1;
                    head1 = head1.next;
                } else {
                    current.next = head2;
                    head2=head2.next;
                }
                current = current.next;
            }

            //when one list runs out, it means head 1 is null or head2 is null. then append the second list.
            if (head1==null){
                // we will add head 2 as the last node.
                current.next = head2;

            } else {
                //head 1 is not null
                current.next = head1;
            }

            //return new list
            return head3;

        }

    }
