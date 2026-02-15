package DSA.Patterns;

public class Q79 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n) {
        int space = n-1;
        int patternWidth = 1;
       
        for(int i=1;i<=n;i++){
             int num = n;
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            int colMid = patternWidth/2 + 1;
            for(int j=1;j<=patternWidth;j++){
                // System.out.print(j +" ");
                if(j<colMid){
                    System.out.print(num-- +" ");
                }
                else{
                    System.out.print(num++ +" ");
                }
            }
            space--;
            patternWidth+=2 ;
            System.out.println();
        }
    }
}
