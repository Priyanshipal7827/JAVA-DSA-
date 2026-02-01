package DSA.Operators.ArithmeticO;

public class Q12 {
    public static void main(String[] args) {
        int n = 128;
        int x = (n%10)*100+((n/10)%10)*10+(n/100);
        System.out.println(x);
    }
}
