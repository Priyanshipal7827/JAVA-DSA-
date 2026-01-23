package DSA.Patterns;

public class Q10 { 


    public static void main(String[] args) {
        printPattern(11);
    }
    public static void printPattern(int n) {
        int mid = n/2+1;        
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n; j++){
                if(i==1||i==n||j==1||j==n||i==j||i+j == n+1||i==mid||j==mid){
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


