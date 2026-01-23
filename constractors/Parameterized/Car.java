package constractors.Parameterized;

public class Car {
    String name;
    int hp;
    
    Car(String name , int hp){
        name = name;
        hp = hp;

    }
    public static void test(){
        System.out.println("Car test");
    }

    public void PrintDetails(){
          System.out.println("Name of Car : " + name);
          System.out.println("HP is : " + hp);                                                                                                                                    

    }  
    
}
