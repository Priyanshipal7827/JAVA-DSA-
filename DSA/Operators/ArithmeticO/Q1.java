package DSA.Operators.ArithmeticO;

public class Q1 {
    public static void main(String[] args) {
        int n = 5783;
        System.out.println(n);
        System.out.println("Last digit of the number : " + n%10);
        System.out.println("Last Two digit of the number : " + n%100);
        System.out.println("remove Last digit of the number : " + n/10);
        System.out.println("remove Last Two digit of the number : " + n/100);
    }
}
