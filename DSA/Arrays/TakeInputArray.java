package DSA.Arrays;
import java.util.Scanner;


public class TakeInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i=0; i<a.length; i++){
            System.out.println("Enter value "+(i+1)+" : ");
            a[i] = sc.nextInt();
        }
        System.out.println("All values are : ");
        for(int n:a){
            System.out.print(n+" ");
        }
        
    }
}
