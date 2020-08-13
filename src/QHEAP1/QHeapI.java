package QHEAP1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class QHeapI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        for(int i = 0; i < n; i++) {
            int q = sc.nextInt();
            switch(q) {
                case 1 :
                    pQueue.add(sc.nextInt());
                    break;
                case 2 :
                    pQueue.remove(sc.nextInt());
                    break;
                case 3 :
                    System.out.println(pQueue.peek());
                    break;
            }
        }
    }
    /*
    A Java stack is part of your computer’s memory where temporary variables, which are created by all functions you do, are stored. It is used to execute a thread and may have certain short-lived values as well as references to other objects. It uses LIFO data structure, or last in first out.

    void somefunction( )
{
  create an object "m" of class Member
    this will be put on the stack since the
    "new" keyword is not used, and we are
    creating the object inside a function

    Member m;
} //the object "m" is destroyed once the function ends
     */

    /*
    Java objects are in an area, which is called the heap. It is created when the program is run, and its size may decrease or increase as your program runs. It can easily become full, and when it does, garbage collection is initiated. This is when objects that are no longer used are deleted to make way for new objects.

    Heap is likened to a global memory pool.

void somefunction( )
{
    /* create an object "m" of class Member
      this will be put on the heap since the
      "new" keyword is used, and we are
      creating the object inside a function

    Member* m = new Member( );

     the object "m" must be deleted
      otherwise a memory leak occurs

    delete m;
}


Stack
The size of the stack will vary as methods and functions create and delete local variables as needed.
Memory is allocated and then subsequently freed without you needing to manage the memory allocation.
Stack has size limits, which can vary according to the operating system you use.
Variables that are stored on the stack exist for as long as the function that created them are running.
Heap
Memory is not managed automatically nor is it as tightly managed by the central processing unit the way stack is managed. You would need to free allocated memory yourself when these blocks are no longer needed.
The heap is prone to memory leaks, where memory is allocated to unused objects and will not be available to processes other than that.
There is no size limit in the heap.
Compared to stack, objects in the heap are much slower to access. It is also slower to write to the memory on the heap.
Stack is easier and faster to use, but it comes with a lot of limitations that you can ignore if you use heap.

When do you use stack?  Stack can only be used for local variables that use up small amounts of memory. The good news is that memory allocation and management is not going to be your problem and access to these objects is very fast. It does suffer from size limitations and the fact that you cannot resize variables on the stack.

When do you use heap? You use the heap to allocate memory if there are variables that you need to be accessed globally, as opposed to just being available only to the methods and functions that created it. Heap is also good when you have a need for a lot of memory since it has no limit on memory size. You can also resize the variables on the heap.
     */

}
