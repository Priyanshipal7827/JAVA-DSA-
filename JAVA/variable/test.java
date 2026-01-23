package JAVA.variable;

public class test {
    //static variable
    // static int x = 10;
    // public static void car(){
    //     int x = 20;
    //     System.out.println(x);
    //     // System.out.println(test.x);
    // }


    // for non static 

    int x = 10;
    public void car(){
        int x = 30;
        System.out.println(x);

    }

    public static void main(String[] args) {
       test t1 = new test();
       t1.car();
    }
}
