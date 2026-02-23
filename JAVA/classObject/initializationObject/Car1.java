package JAVA.classObject.initializationObject;

public class Car1 {
    // initialization by using setter & getter methd
    String brand;
    double price;
    int hp;

    // setter method for set details
    public void setDetails(String b, double p, int h) {
        hp = h;
        brand = b;
        price = p;
    }

    // getter method for get details
    public void printDetails() {
        System.out.println("================================");
        System.out.println("Brand is : " + brand);
        System.out.println("Price is : " + price);
        System.out.println("HP is : " + hp);
        System.out.println("=================================");
    }

    public static void main(String[] args) {
        Car1 c1 = new Car1();
        Car1 c2 = new Car1();
        c1.setDetails("TATA", 5675684.9, 150);
        c1.printDetails();

        c2.setDetails("BMW", 167684.9, 180);
        c2.printDetails();

    }
}
