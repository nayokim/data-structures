package InsertNodeAtLL;

import java.io.BufferedWriter;
import java.io.IOException;

public class InsertNodeAtLLII {
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

    public static void printSinglyLinkedList(InsertNodeAtLLI.SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
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
        //create new node
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        SinglyLinkedListNode current = head;


        int index = 0;
        while (index < position -1){
            //traverse the list with .next
            current = current.next;
            index++;
        }
        //when we reach position -1, we are at the position right BEFORE where we want to insert the node so we want to take the next position and put it in the next position from the current position - pushes that current value over it to the next position
        node.next = current.next;
        //then we set the current.next which is the new position to our new node
        current.next = node;
        return  head;
    }



}
