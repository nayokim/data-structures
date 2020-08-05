package ArrayDSP;

import java.util.Scanner;

//   //Given an array, A , of N integers, print each element in reverse order as a single line of space-separated integers.
//    //reverse the array
//    //[1,4,3,2]
public class ArrayDS2 {
    static int[] reverseArray(int[] a) {
        Scanner scanner = new Scanner(System.in);
        int[] reverseArr = new int[a.length];
        for (int i = 0; i < a.length;  i++){
            reverseArr[a.length - 1 -i] = a[i];
        }
        return reverseArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int []  arr = new int [size];
//        int [] arr = new int [4];
//        arr[0] = 1;
//        arr[1] = 4;
//        arr[2] = 3;
//        arr[3] = 2;
//        System.out.println(arr);

        for (int i = 0; i < arr.length; i++){

//            System.out.println(arr.length); // will print the length, length times;
//            System.out.println(arr.length - 1); // will print the length - 1 (arr are 0 indexbased)
//            System.out.println(i); // loops i
            //if size = 5
//            System.out.println(arr.length ); //= 5;
//            System.out.println(arr.length - 1 ); // = 4
//            System.out.println(i); // 4,3,2,1,0;
//            System.out.println(arr.length-1+i);// 4,5,6,7,8 : if you + i, you will be ascending up
//            System.out.println(arr.length -1 -i); // therefore, -i, descends
        }

    }
}
