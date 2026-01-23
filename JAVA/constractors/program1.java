package JAVA.constractors;

public class program1 {
    int x = 10;

    public void setDeatils(int a) {
        x = a;
        System.out.println("value of x : " + x);
    }

    public int printDetails() {
        return x;
    }

    public static void main(String[] args) {
        program1 p1 = new program1();
        p1.setDeatils(10);
        p1.printDetails();
    }
}
