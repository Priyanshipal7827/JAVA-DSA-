package DSA.Patterns;

public class Q6 {
    public static void main(String[] args) {
        printPattern(9);
    }
    public static void printPattern(int n) {
        for(int i = 1; i<=n; i++){
            for(int j= 1; j<=n;j++){
                if(i==1||i==2||i==n||i==n-1||j==1||j==2||j==n||j==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
