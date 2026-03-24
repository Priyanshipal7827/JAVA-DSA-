package DSA.String;

public class Q1 {
   public static void main(String[] args) {
    int num = 5;
       print(num);
   }
   public static void print(int n) {
       for(int i=n;i>=1;i--){
        for(int j=n;j>=i;j--){
            System.out.print(i+ " ");
        }
        System.out.println();
       }
   }

}