package DSA.Patterns;

import JAVA.constractors.program1;

public class Q15 {
    public static void main(String[] args) {
        printPattern(7);
    }

    public static void printPattern(int n) {
        int space = n - 1;
        int patternWidth = 1;
       for(int i=1;i<=n;i++){
        for(int j = 1;j<=space;j++){
            System.out.print("  ");
        }
        for(int j = 1; j<=patternWidth;j++){
            System.out.print("* ");
        }
        space--;
        patternWidth++;
        System.out.println();
       }
    }
}
