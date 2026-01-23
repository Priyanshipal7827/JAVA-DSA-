package constractors;

public class Laptop {
   String name;
   int ram;
   Laptop(){
      System.out.println("Laptop object is created");
   }
   Laptop(String name, int ram){
      this.name = name;
      this.ram = ram;

   }

   public void start(){
      System.out.println("Start laptop");
   }

   public static void test(){
      System.out.println("test laptop");
   }
}
