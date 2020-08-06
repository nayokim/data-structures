package LeftRotation;

import java.util.Scanner;

public class LeftRotationII {
    static int[] rotLeft(int[] a, int d) {
        int size = a.length;
        int [] newArray = new int[size];

        for (int i = 0; i < size; i++){
            //1,2,3,4,5
            //RR = (i + (n-d)) % n
            int rotatedPositions = (i + (size-d)) % size;
            newArray[rotatedPositions] = a[i];
        }
        return newArray;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);
        int[] a = new int[n];

        int res[] = rotLeft(a, d);
        for (int p : res){
            System.out.print(p + " ");
        }

    }
}
