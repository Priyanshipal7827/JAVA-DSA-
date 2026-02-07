package DSA.Patterns;

public class Q64 {
    public static void main(String[] args) {
        printPattern(5);

    }

    public static void printPattern(int n) {
        int space = n - 1;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "   ");
            }
            space--;
            System.out.println();
        }
    }
}
