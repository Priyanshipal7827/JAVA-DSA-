package DSA.Operators.ArithmeticO;

public class Q2 {
    public static void main(String[] args) {
        int n = 578;
        while (n>0) {
            int digit = n%10;
            System.out.println(digit);
            n = n/10;
        }     
       
    }
}
