package DSA.Patterns;

public class Q50 {
    public static void main(String[] args) {
        printPattern(5);
    }

    public static void printPattern(int n) {
        int space = n - 1;
        int patternWidth = 1;
        int num = n * (n + 1) / 2 + 64;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            int count = num;
            for (int j = 1; j <= patternWidth; j++) {
                System.out.print((char)count + " ");
                count++;
            }
            space--;
            num =num-(i+1);
            patternWidth++;
            System.out.println();
        }
    }
}
