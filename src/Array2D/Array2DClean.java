package Array2D;


public class Array2DClean {
    static int hourglassSum(int[][] arr) {

        int rows = arr.length;
        int columns = arr[0].length;

        //minimum possible value
//        int max_hourglass_sum = Integer.MIN_VALUE;
        //from the constraint, the minimum value is -9. Each hourglass is made up of 7 values so the largest sum is 63
        int max_hourglass_sum = -63;

        for (int i = 0; i < rows-2; i++) {
            for (int j = 0; j < columns-2; j++) {
                int current_hourglass_sum = arr[i][j] + arr[i][j+1]+ arr[i][j+2]+ arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1] + arr[i+2][j+2];
                max_hourglass_sum = Math.max(max_hourglass_sum, current_hourglass_sum);
            }
        }
        return max_hourglass_sum;
    }
}
