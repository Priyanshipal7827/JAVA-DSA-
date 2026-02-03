package DSA.Patterns;

public class Q46 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n) {
        int num = n*(n+1)/2+64;
        int space = n-1;
        int  patternWidth = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=patternWidth;j++){
                System.out.print((char) num+"\t");
                num--;
            }
            space--;
            patternWidth++;
            System.out.println();
        }
    }
}
