package DSA.Patterns;

public class Q60{
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n) {
        int space = n-1;  
        int num = n;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(num+ "   ");               
            }
            space--;  
            num--;          
            System.out.println();
        }
    }
}
