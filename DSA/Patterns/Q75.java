package DSA.Patterns;
public class Q75 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n) {
        int space =n-1;
        int num = n*n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            for(int j=2*i-1;j>=1;j--){
                System.out.print(num+"\t");
                num--;
            }
            space--;
            
            System.out.println();
        }
    }
}

