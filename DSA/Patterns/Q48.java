public class Q48 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n) {
        int num = 64+1;
        int space = n-1;
        int patternWidth = 1;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=patternWidth;j++){
                System.out.print((char)num+" ");
            }
            space--;
            patternWidth++;
            num = num+1;
            System.out.println();
        }
    }
}
