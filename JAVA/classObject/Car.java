package JAVA.classObject;

class DriveCar {
    String name;
    double price;

    public void setMethod(String n, double p) {

        name = n;
        price = p;
    }

    // print details
    public void printDetails() {
        System.out.println("**********Details of Car**********");
        System.out.println("Name is : " + name);
        System.out.println("Price is : " + price);

    }

    public static void main(String[] args) {
        DriveCar c1 = new DriveCar();
        DriveCar c2 = new DriveCar();

        c1.setMethod("TATA", 4564474);
        c2.setMethod("Maruti", 6564474);
        c1.printDetails();
        c2.printDetails();

    }

}
