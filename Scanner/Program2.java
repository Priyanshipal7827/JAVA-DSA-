import java.util.Scanner;

public class Program2 {
   public Program2() {
   }

   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
    //   System.out.print("Enter Num 1 : ");
    //   int num1 = sc.nextInt();
    //   System.out.print("Enter Num 2 : ");
    //   int num2 = sc.nextInt();
    //   int sum = num1 + num2;
    //   System.out.print("Sum of " + num1 + " and " + num2 + " = " + sum);

    // Case one
    String name = sc.nextLine();
    int age = sc.nextInt();
    System.out.println("Enter Name : " + name);
    System.out.println("Enter AGE : " + age);
      sc.close();
   }
}
