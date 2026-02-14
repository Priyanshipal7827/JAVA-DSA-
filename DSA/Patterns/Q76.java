package DSA.Patterns;
public class Q76 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n) {
        int space = n-1;
        for(int i=1;i<=n;i++){
            // Space loop
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            // Left part - 1 se i tak
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            // Right part - i-1 se 1 tak
            for(int j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            space--;
            System.out.println();
        }
    }


}
