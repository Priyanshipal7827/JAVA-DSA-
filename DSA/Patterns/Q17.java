package DSA.Patterns;

public class Q17 {
    public static void main(String[] args) {
        printPattern(7);
    }
    public static void printPattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j= 1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
