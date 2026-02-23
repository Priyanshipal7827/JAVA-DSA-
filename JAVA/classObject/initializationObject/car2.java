package JAVA.classObject.initializationObject;

public class car2 {
    // initialzation by using constructor
    String name;
    double price;
    int hp;
    //constructor
    car2(String n, double p,int h){
         name = n;
         price = p;
         hp = h;
    }
    //access or getter method
    public void printDetails(){
        System.out.println("==============================");
        System.out.println("Name is :" + name);
        System.out.println("Price is :" + price);
        System.out.println("HP is :" + hp);
        System.out.println("===============================");

    }
    public static void main(String[] args) {
        car2 c1 = new car2("Maruti",554544.0,140);
        car2 c2 = new car2("TATA",3554544.0,180);
        car2 c3 = new car2("BMW",854544.0,190);
        c1.printDetails();
        c2.printDetails();
        c3.printDetails();
    }

}
