package DSA.Patterns;

public class Q47 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n) {
        int space =n-1;
        int patterWidth = 1;
        int num = n+64;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=patterWidth;j++){
                System.out.print((char) num+" ");
                
            }
            space--;
            patterWidth++;
            num--;
            System.out.println();

        }
    }
}
