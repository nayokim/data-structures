package ArrayDSP;

import java.util.Scanner;

public class ArraysDS {

    //Given an array, A , of N integers, print each element in reverse order as a single line of space-separated integers.
    //reverse the array
    //[1,4,3,2]
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //variable size will be what is inputted into scanner
        int size = scanner.nextInt();
        //instantiate the size
        int [] array = new int [size];

        //fill the array
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
//        for  (int arrays : array){
//            System.out.println(arrays);
//        }
        scanner.close();
        /* Print elements in reverse order */
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
