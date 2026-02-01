package DSA.Operators.ArithmeticO;

public class Q4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //with using third variable
        int c = a; // for store value(a) in temp variable
        a = b; // assign value(b) in a
        b = c;// assign value(c) or value(a) in b
        // System.out.println(c); // temp variable
        System.out.println(a);
        System.out.println(b);
        // without using third variable
        b = b - a; // 20-10= 10
        a = a + b; // 10+10=20
        System.out.println(a);
        System.out.println(b);

    }
}
