package DSA.Arrays;
import java.util.*;
public class arrayProgram3 {
    public static void main(String[] args) {
        int[] a = {12,10,20,15,30};
        int index=Arrays.binarySearch(a, 30);// search elements
        System.out.println("Index of element: " + index);
    }
}
