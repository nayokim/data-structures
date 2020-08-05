package Array2D;

public class Array2D3 {
    //1 1 1 0 0 0
    //0 1 0 0 0 0
    //1 1 1 0 0 0
    //0 0 0 0 0 0
    //0 0 0 0 0 0
    //0 0 0 0 0 0

    //===an hour glass===
    //a b c
    //  d
    //e f g

    //-9 -9 -9  1 1 1
    // 0 -9  0  4 3 2
    //-9 -9 -9  1 2 3
    // 0  0  8  6 6 0
    // 0  0  0 -2 0 0
    // 0  0  1  2 4 0

    //-63, -34, -9, 12,
    //-10, 0, 28, 23,
    //-27, -11, -2, 10,
    //9, 17, 25, 18
    static int hourglassSum(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;

//      you should initialize the max value to the value of the first hourglass.
//       int max_hourglass_sum = Integer.MIN_VALUE;

        //looping through a 2D array
//        for (int i = 0; i < rows; i++){ // rows
//            for (int j = 0 ; j < columns; j++){  // columns
//                int currentSum  = arr[i][j] // current  value
//            }
//        }

        // you want to set a sum to a minimum possible value so as soon as you see something bigger than that, you can have a max sum
        //REMEMBER: Indexoutofbounds error! Theres only 16 hour glasses and then it ends! Since we are accessing indices 2 steps ahead, we have to subtract 2 from the loop numbers
        int max_hourglass_sum = -63;

        for (int i = 0; i < rows - 2; i++){
            for (int j = 0 ; j < columns - 2; j++){
                int currentSum  = arr[i][j] + arr[i][j+1] +  arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j]+ arr[i+2][j+1] + arr[i+2][j+2];
                //everytime we calculate our current sum, we do a math.max check and we compare the max_hourglass_Sum to the currentSum
                max_hourglass_sum = Math.max(max_hourglass_sum , currentSum);
            }
        }
        return max_hourglass_sum;
    }

    public static void main(String[] args) {
        int[][] foo = new int [][]{
                new int[] {1,2,3},
                new int[] {1,2,3,4},
        };
//        System.out.println(foo.length); // gives count of rows
//        System.out.println(foo[0].length);//gives count of columns for particular row
//        System.out.println(foo[1].length);//4

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6, 0},
                {7, 8, 9},
                {10,11,12,13}
        };
        System.out.println(matrix.length); // 3 gives count of rows
        System.out.println(matrix[0].length); // gives count of columns at first row
        System.out.println(matrix[1].length);// gives count of columns at second row
    }

}
