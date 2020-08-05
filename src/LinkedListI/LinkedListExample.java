package LinkedListI;

import org.w3c.dom.ls.LSOutput;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {


        //linked link is a data strcture
        LinkedList<String> linky = new LinkedList();
        //each value in the list knows the front and next element. Very flxible
        linky.add("Willa");
        linky.add("Nayoung");
        linky.add("Ed");
//        System.out.println(linky);

        LinkedList<Integer> linky2 = new LinkedList<Integer>();
        linky2.add(2);
        linky2.add(1);
        linky2.add(10);
        System.out.println(linky.get(1));
        Iterator it = linky2.iterator();
        while (it.hasNext()) {
            if ((int) it.next() == 1) {
                System.out.println("We found 1");
            }
        }

        //a linked list is made up of Nodes that contain a data element along with a pointer to the next element in the list. Because of this, it is possible to traverse the list in order with knowledge of only the first element. The .next is used to access the next data member relative to the current node. When you insert an element, you usually need to do something like this:
//        public void insertNode(Node nodeBefore, Node newNode){
//            newNode.next = nodeBefore.next;
//            nodeBefore.next = newNode;
//        }
//        This method inserts the Node newNode after the Node nodeBefore so that when you traverse the list, after you reach nodeBefore you reach newNode. Typically, the end of the list of signified by a null pointer.
        // firstNode          newNode
        //+------+------+    +------+------+
        //| data | next-|--->| data | null |
        //+------+------+    +------+------+

    }

}
