package DSA.Patterns;

public class Q39 {
    public static void main(String[] args) {
        printPattern(7);
    }
    public static void printPattern(int n) {
        int space = n-1;

        int num = n;
        int patternWidth = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=patternWidth;j++) {
                System.out.print(num +" ");
            }
            space--;
            patternWidth++;
            num--;
            System.out.println();
        }
    }
}
