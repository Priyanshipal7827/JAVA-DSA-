package DSA.Patterns;

public class Q16 {
    public static void main(String[] args) {
        printPattern(7);
    }
    public static void printPattern(int n) {
        int space = 0;     
        int patternWidth = n;  
        for(int i=1;i<=n;i++){   
            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }
             for(int j=1;j<=patternWidth;j++){
                System.out.print("* ");
            } 
                  
            space++;
            patternWidth--;
            System.out.println();
        }
    }
}
