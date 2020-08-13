package MaximumElement;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElementI {
    public static void main(String[] args) {
        /*

        1 x  -Push the element x into the stack.
        2    -Delete the element present at the top of the stack.
        3    -Print the maximum element in the stack.

        8
       1 10 push
       1 20 push
       1 15 push
       1 30 push
       2 delete
       3 print max
       1 40  push
       3 print max
         */


        /*
        maintain two stacks
        main stack              max stack

        40                      40
        x30                      x30 - this is the top after (1 30) so you delete
        15                      20 - compare 15 to 20. 20 > 15 so keep 20
        20                      20
        10                      10

         */

        //

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();

        maxStack.push(Integer.MIN_VALUE);

        for (int i = 0; i < N; i++) {
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    int item = scanner.nextInt();
                    mainStack.push(item);
                    int maxSoFar = maxStack.peek();
                    if (item > maxSoFar) {
                        mainStack.push(item);
                    } else {
                        maxStack.push(maxSoFar);
                    }
                    break;
                case 2:
                    //because even if value in mainStack get popped, value at peek of maxStack may be different.
                    if (maxStack.peek() == mainStack.peek()) maxStack.pop();
                    break;
                case 3:
                    System.out.println(maxStack.peek());
                    break;
            }

        }


    }
}
