package JesseAndCookies;

import java.util.PriorityQueue;

public class JesseAndCookiesI {
//your algorithm can be summarized as follows:
//
//Fetch the list of cookies and sort in ascending order.
//Initialize a counter to zero
//If the smallest cookie is less than K, then:
//(a) Increment the counter and combine this cookie with the next smallest cookie (or return -1 if there are fewer than 2 cookies left)
//(b) Remove the two smallest cookies from the list and add the new cookie to the list
//(c) Sort the list in ascending order again
//Otherwise, exit with the value of the counter
//Go back to step 3
    static int cookies(int k, int[] A) {
        /*
         * Write your code here.
         */

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i : A) {
            queue.add(i);
        }

        int numOperations = 0;

        while (queue.size() > 0 && queue.peek() < k) {
            numOperations++;

            if (queue.size() < 2) return -1;

            int x = queue.poll();
            int y = queue.poll();

            queue.add(x + (2 * y));
        }

        return numOperations;

    }

    public static void main(String[] args) {

    }
}
