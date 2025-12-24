import java.util.Scanner;

public class Program2 {
    public Program2() {
    }

    public static void main(String[] var0) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Num 1 : ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter Num 2 : ");
        // int num2 = sc.nextInt();
        // int sum = num1 + num2;
        // System.out.print("Sum of " + num1 + " and " + num2 + " = " + sum);

        // Case one
        // String name = sc.nextLine();
        // int age = sc.nextInt();
        // System.out.println("Enter Name : " + name);
        // System.out.println("Enter AGE : " + age);

        // //case 2
        // int age = sc.nextInt();
        // String name = sc.nextLine();
        // System.out.println("Enter AGE : " + age);
        // System.out.println("Enter Name : " + name);

        // case 3
        // String name = sc.nextLine();
        // String Address = sc.nextLine();
        // System.out.println("Enter Name : " + name);
        // System.out.println("Enter Addess : " + Address);


        //All types of Primitive data input
        int i = sc.nextInt();
        System.out.println("int data is : " +i);
        byte  b= sc.nextByte();
        System.out.println("byte data is : " +b);
        short  s= sc.nextShort();
        System.out.println("short data is : " +s);
        float  f= sc.nextFloat();
        System.out.println("float data is : " +f);
        long  l= sc.nextByte();
        System.out.println("long data is : " +l);
        double d = sc.nextDouble();
        System.out.println("double data is : " + d);

        sc.close();
    }
}
