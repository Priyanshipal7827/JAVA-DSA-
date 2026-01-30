package DSA.Patterns;

public class Q31 {
    public static void main(String[] args) {
        printPattern(7);
    }

    public static void printPattern(int n) {
        int num = n*(n+1)/2+64;
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print(i +  " ");
            }
          num++;
            System.out.println();
        }
    }
}
