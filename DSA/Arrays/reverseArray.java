package DSA.Arrays;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        System.out.println("Orignal Array : "+Arrays.toString(arr));
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        
    }
    public static void reverse(int[] a){
        int start = 0;
        int end = a.length-1;
        while(start<end){
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;          
            start++;
            end--;
        }
    }

}