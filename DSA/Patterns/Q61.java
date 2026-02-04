package DSA.Patterns;

public class Q61 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n) {
        int space = n-1;
        int patternWidht = 1;
        int num = 65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=patternWidht;j++){
                System.out.print((char)num +"   ");
            }
            space--;
            patternWidht++;
            num++;
            System.out.println();
        }
    }
}
