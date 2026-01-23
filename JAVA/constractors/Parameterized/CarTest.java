package JAVA.constractors.Parameterized;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("Main Method is Started");
        Car.test();
        Car c1 = new Car("BMW",   180);
        c1.PrintDetails();


    }
}
