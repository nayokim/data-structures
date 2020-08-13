package MaximumElement;

import java.util.Scanner;
import java.util.Stack;

public class MaxElementII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();
        int option = 0;
        int element = 0;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stackMax = new Stack<>();
        for (int i = 0; i < queries; i++) {
            option = sc.nextInt();
            if (option == 1) {
                element = sc.nextInt();
                stack.push(element);
                if (stackMax.isEmpty()) {
                    stackMax.push(element);
                } else {
                    if (stackMax.peek() > element) {
                        stackMax.push(stackMax.peek());
                    } else {
                        stackMax.push(element);
                    }
                }
            } else if (option == 2) {
                stack.pop();
                stackMax.pop();
            } else if (option == 3) {
                System.out.println(stackMax.peek());
            }
        }
        sc.close();
    }
}
