package DSA.Patterns;

public class Q28 {
    public static void main(String[] args) {
        printPattern(5);
    }
     public static void printPattern(int n) {
        int num = n*(n+1)/2 + 64;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)num-- +" ");
            }
           
            System.out.println();
        }
    }
}
