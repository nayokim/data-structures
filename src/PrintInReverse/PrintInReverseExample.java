package PrintInReverse;

import java.util.Stack;

public class PrintInReverseExample {
    public static void main(String[] args) {
        // a stack is a Last in First out (LIFO) data structure. It supports two basic operations : Push and Pop.
        //Push : adds an element at the top of the stack
        //Pop : removes an element from the top of the stack
        // java provides a stack class which models the stack data structure

        //creating a stack
        Stack<String> stackOfCards = new Stack<>();
//        stackOfCards.pop(); // Throws EmptyStackException if the stack is empty
//        System.out.println(stackOfCards);

        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");
        //stack will look like (from bottom to top) : Jack, Queen, King, Ace
        System.out.println("stackOfCards : " + stackOfCards);
        //LIFO : ace is the top and  will the first to go if use pop


        // Popping items from the Stack
        stackOfCards.pop();
        System.out.println("stackOfCards after pop: " + stackOfCards); // jack, queen, king

        //Get the item at the top of the stack without removing it
        String cardAtTop = stackOfCards.peek();
        System.out.println("card at top using .peek(): " + cardAtTop);



    }
}
