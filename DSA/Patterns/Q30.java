package DSA.Patterns;

public class Q30 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n) {
       
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+j) + " ");
            }
            
            System.out.println();
        }
    }
}
