package DSA.Patterns;

public class Q14 {
    public static void main(String[] args) {
        printPattern(7);
    }
    public static void printPattern(int n) {
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
