package DSA.Operators.ArithmeticO;

public class Q5 {
    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 20;
        int val3 = 30;
        // int val4 = val1; swap number with using fourth variable
        // val1 = val2;
        // val2 = val3;
        // val3 = val4;
        // System.out.println(val1);   
        // System.out.println(val2);   
        // System.out.println(val3); 
        val1 = val1+val2+val3;
        val2 = val1-val2;
        val3= val2-val3;
        
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);       
    }
}
