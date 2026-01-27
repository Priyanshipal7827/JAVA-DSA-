package DSA.Patterns;

public class Q22 {
    public static void main(String[] args) {
        printPattern(7);
    }
    public static void printPattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j+" " );
             
              
            }
            System.out.println();
        }
    }
}
