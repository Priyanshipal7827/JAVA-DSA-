package DSA.Patterns;

public class Q42 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n ) {
        int space = n-1;
        int num = n*(n+1)/2;
        // int patternWidth = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            int count = num;
            for(int j=1;j<=i;j++){
                System.out.print(count+"\t");
                count++;
            }
            space--;
            // patternWidth++;
            num = num-(i+1);
            System.out.println();
        }
    }
}
