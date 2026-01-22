package variable;

public class test {
    static int x = 10;
    public static void car(){
        int x = 20;
        System.out.println(x);
        // System.out.println(test.x);
    }
    public static void main(String[] args) {
        car();
    }
}
