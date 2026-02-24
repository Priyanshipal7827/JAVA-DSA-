package JAVA.classObject;

public class Program2 {
// these are the states of program

    static String name;
    int id;
    int age;

    public void setDetails(String n, int i, int a) {
        name = n;
        age = a;
        id = i;
    }

    public void printDetails() {
        System.out.println("Name is : " + name);
        System.out.println("ID is : " + id);
        System.out.println("Age is : " + age);
        System.out.println("======================================");
    }

    public static void main(String[] args) {
        Program2 p1 = new Program2();
        p1.setDetails("priya", 101, 20);
        p1.printDetails();

        Program2 p2 = new Program2();
        p2.setDetails("divya", 102, 21);
        p2.printDetails();

        Program2 p3 = new Program2();
        p3.setDetails("neha", 103, 22);
        p3.printDetails();

    }
}
