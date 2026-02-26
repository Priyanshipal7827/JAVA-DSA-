package DSA.Arrays;
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {90,30,10,40,54,32};
        System.out.println(getSecondMax(arr));
    }
    public static int getSecondMax(int[] a){
        long max  = a[0];
        long secondMax = Long.MIN_VALUE;
        for(int n:a){
            if(n>max){
                secondMax = max;
                max = n;
            }
            else if(n>secondMax && n!=max){
                secondMax = n;
            }            
        }
        return secondMax !=Long.MIN_VALUE?(int)secondMax:(int)max;

    }
}
