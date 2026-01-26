package DSA.Patterns;

public class Q21 {
   public static void main(String[] args) {
    printPattern(7);
   }
   public static void printPattern(int n) {
     for(int i=n;i>=1;i--){
        for(int j=n;j>=i;j--){
            System.out.print( i+" ");
        }
        System.out.println();
     }
   }
}
