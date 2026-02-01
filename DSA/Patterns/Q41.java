package DSA.Patterns;

public class Q41 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n) {
        int space = n-1;      
        int num = 1;
        //outer loop for print rows
        for(int i=1;i<=n;i++){
            //inner loop for print space
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            //inner loop for print numbers
            int count = num+i-1;
            for(int j=1;j<=i;j++){
                System.out.print(count+ "\t");
                count--;
            }
            space--;
           
            num = num+i;
            System.out.println();
        }
    }
}
