package LeftRotation;

import java.util.Scanner;

//rotation : [1,2,3,4,5] -> [3,4,5,1,2]
public class LeftRotationI {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] newArray = new int[a.length];
        //Right Rotation (RR) = n - Left Rotation
        //RR = n - d;

        //When you have an array and you want to continuously loop through that array, use something similar to the following:
        //nextIndex = (currentIndex + 1)%array.length

        //new index = (i + (n-d)) % n

        for (int i = 0; i < a.length; i++){
            int newPosition = (i + (a.length-2)) % a.length;
            newArray[newPosition] = a[i];

        }

        for (int p: newArray){
            System.out.println(p);
        }


    }
}
