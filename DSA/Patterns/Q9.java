package DSA.Patterns;

public class Q9 {
    public static void main(String[] args) {
        printPattern(7);
    }

    public static void printPattern(int n) {
        int mid = n/2+1;
        for(int i = 1; i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==mid||j==mid){
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