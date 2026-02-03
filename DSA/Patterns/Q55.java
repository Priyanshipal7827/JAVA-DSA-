package DSA.Patterns;

public class Q55 {
    public static void main(String[] args) {
        printPattern(5);
    }

    public static void printPattern(int n) {
        int space = n-1;
        // int patternWidth = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((i+j)%2 + "   ");
            }
            space--;
            // patternWidth++;
            System.out.println();
        }

    }
}
