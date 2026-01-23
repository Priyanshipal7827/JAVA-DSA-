package DSA.Patterns;

public class Q2 {
    public static void main(String[] agrs){
        printPattern(5);
    }

    public static void printPattern(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=n;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
