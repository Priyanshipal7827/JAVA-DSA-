package DSA.Arrays;

import java.util.Arrays;

public class reverseHalfArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        System.out.println("Orignal Array "+ Arrays.toString(arr));
        reverseHaft(arr, 0, arr.length/2-1);
        reverseHaft(arr, arr.length/2, arr.length-1);
        System.out.print("Reversed : " + Arrays.toString(arr));
    }
    public static void reverseHaft(int[] a,int start,int end){
        while (start<end) {
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;
            start++;
            end--;
        }
    }
}
