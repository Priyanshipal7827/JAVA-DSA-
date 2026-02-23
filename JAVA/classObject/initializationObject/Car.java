package JAVA.classObject.initializationObject;

public class Car {
    //initialized object by using refrence
    String name;
    double price;
    int hp;
    public static void main(String[] args) {
        
        Car c1 = new Car();
        c1.name = "tata";
        c1.price = 758764.0;
        c1.hp = 120;
        System.out.println(c1.price);
        System.out.println(c1.name);
        System.out.println(c1.hp);
    }
}
