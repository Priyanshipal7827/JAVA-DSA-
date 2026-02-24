package JAVA.classObject;

public class Program2 {
// these are the states of program

    static String name;// static variable
    int id;   //non static variable
    int age; //non static variable

    //design a method for set details of states
    // behaviours
    public void setDetails(String n, int i, int a) {
        name = n;
        age = a;
        id = i;
    }

    // design a methid for print details of states
    public void printDetails() {
        System.out.println("Name is : " + name);
        System.out.println("ID is : " + id);
        System.out.println("Age is : " + age);
        System.out.println("======================================");
    }

    //main method
    public static void main(String[] args) {
        //create a object 
        Program2 p1 = new Program2();
        p1.setDetails("priya", 101, 20);
        p1.printDetails();

        //create a object 
        Program2 p2 = new Program2();
        p2.setDetails("divya", 102, 21);
        p2.printDetails();

        //create a object 
        Program2 p3 = new Program2();
        p3.setDetails("neha", 103, 22);
        p3.printDetails();

    }
}
