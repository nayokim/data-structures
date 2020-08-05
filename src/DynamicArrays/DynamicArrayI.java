package DynamicArrays;

import java.util.ArrayList;
import java.util.List;

public class DynamicArrayI {
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        //create a list of list of integers
        List<List<Integer>> seqList = new ArrayList<>();

        //initialize with empty list
        for (int i = 0; i < n; i++) {
            seqList.add(new ArrayList<Integer>());
        }
        //return correct result
        List<Integer> correctQueries = new ArrayList<>();
        // create lastAnswer variable
        int lastAnswer = 0;

        for (List<Integer> q : queries) {
            int index = (q.get(1) ^ lastAnswer) % n;

            int y = q.get(2);

            switch (q.get(0)) {
                //look at our list, grab that number and add y to it
                case 1:
                    seqList.get(index).add(y);
                    break;
                //
                case 2:
                    int size = seqList.get(index).size();
                    lastAnswer = seqList.get(index).get(y % size);
                    correctQueries.add(lastAnswer);
                    break;
            }
        }
        return correctQueries;
    }
}
