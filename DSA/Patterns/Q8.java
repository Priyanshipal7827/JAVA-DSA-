package DSA.Patterns;

public class Q8 {   
    public static void main(String[] args) {
        printPattern(7);
    }
    public static void printPattern(int n) {
         for(int i = 0; i<n;i++){
            for(int j = 0;j<n;j++){
                if(i==j||i+j==n-1){
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
