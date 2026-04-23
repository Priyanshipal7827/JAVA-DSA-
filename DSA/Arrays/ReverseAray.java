package DSA.Arrays;

public class ReverseAray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        for(int n:arr){
            System.out.print(n +" ");
        }
        reverseArray(arr);
        for(int n:arr){
            System.out.print(n +" ");
        }

    }
    public static void reverseArray(int[] a){
        int start = 0;
        int end = a.length-1;
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    } 
}
