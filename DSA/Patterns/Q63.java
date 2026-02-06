package DSA.Patterns;

public class Q63 {
    public static void main(String[] args) {
        printPeterns(5);
    }
    public static void printPeterns(int n) {
        int space = n-1;
    int patternWidth = 1;
    int num = n+;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=space;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=patternWidth;j++){
            System.out.print((char)(num)+ "   ");
        }
        space--;
        patternWidth++;
        // num++;
        System.out.println();
    }
    }
}
