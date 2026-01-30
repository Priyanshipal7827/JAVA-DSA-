package DSA.Patterns;

public class Q38 {
    public static void main(String[] args) {
        printPattern(7);
    }

    public static void printPattern(int n) {
        int num = n*(n+1)/2;
        int space = n-1;
        int patternWidth = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=patternWidth;j++){
                System.out.print(num-- +"\t");
            }
            space--;
            patternWidth++;
            // num++;
            System.out.println();
        }
    }
}
