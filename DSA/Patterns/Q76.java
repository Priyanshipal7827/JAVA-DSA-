package DSA.Patterns;
public class Q76 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n) {
        int space = n-1;
        for(int i=1;i<=n;i++){
            // Space loop
            for(int j=1;j<=space;j++){
                System.out.print("  ");
                
            }
            // Single loop with if-else
            for(int j=1;j<=2*i-1;j++){
                if(j<=i){
                    System.out.print(j+" ");
                } else {
                    System.out.print((2*i-j)+" ");
                }
            }
            space--;
            System.out.println();
        }
    }
}