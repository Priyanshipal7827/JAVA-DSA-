import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(prodExceptSelf(arr)));

    }

    public static int[] prodExceptSelf(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        res[0] =1; 
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * arr[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= arr[i];
        }
        return res;
    }
}