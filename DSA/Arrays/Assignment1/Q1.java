package DSA.Arrays.Assignment1;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int[] b = {60,70,80,90,100};
        System.out.println("Array a : "+ Arrays.toString(a));
        System.out.println("Array b : "+ Arrays.toString(b));

       int[] temp = a;
       a=b;
       b=temp;
       System.out.println("array a : " + Arrays.toString(a));
       System.out.println("array b : " + Arrays.toString(b));

        
    }
    // public static void swapArray(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]);
    //     }
    // }
}

