package DSA.Operators.ArithmeticO;

public class Q4 {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        // int c = a; using third variable
        // a = b;
        // b = c;
        // System.out.println(a);
        // System.out.println(b); 
        
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
