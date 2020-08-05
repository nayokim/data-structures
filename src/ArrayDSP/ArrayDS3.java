package ArrayDSP;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//    Given an array, A , of N integers, print each element in reverse order as a single line of space-separated integers.
//    reverse the array
//    [1,4,3,2]
public class ArrayDS3 {
    static int[] reverseArray(int[] a) {
        int [] array = new int[a.length];
        for (int i = 0; i < array.length; i++){
            array[a.length - 1 - i] = a[i];
            System.out.println(array);
        }
        return array;
    }

    public static void main(String[] args) {

    }
}
