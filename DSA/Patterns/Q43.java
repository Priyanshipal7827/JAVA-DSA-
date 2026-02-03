package DSA.Patterns;

public class Q43 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n) {
        int num = 65;
        int space = n-1;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)num+ " ");
            }
            space--;
            num++;
            System.out.println();
        }
    }
}
