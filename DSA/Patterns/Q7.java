package DSA.Patterns;

public class Q7 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n) {
        for(int i = 1; i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print("(" + i + "," + j+ ")");
            }
            System.out.println();
        }
    }
}
