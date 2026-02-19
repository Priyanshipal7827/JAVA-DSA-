package DSA.Arrays;
import java.util.*;
public class arrayProgram4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,10,20,15,30};
        System.out.print("Enter element to search : ");
        int element = sc.nextInt();
        int index = Arrays.binarySearch(arr, element);
        if(index>=0){
            System.out.println(element +" is found at index : "+index);
        }
        else{
            System.out.println(element +" is not found in the array but can fit at index : "+(-index -1));
        }
        sc.close();
    }
}
