package DSA.Arrays;
public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        for(int n: arr){
            System.out.print(n +" ");
        }
        System.out.println("\nAfter Swapping");
        swap(arr,0,arr.length-1);
        for(int n:arr){
            System.out.print(n + " ");
        }

    }
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
