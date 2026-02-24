package JAVA.Assigment.vehicle;

public class vehicle {
    String name;
    double price;
    int vNo;

    public  void setDetails(String n,double p,int v){
        name = n;
        price = p;
        vNo = v;
    }
    public void printDetails(){
        System.out.println("Name is : "+ name);
        System.out.println("Price is : "+ price);
        System.out.println("Vehicle No is : "+ vNo);
        System.out.println("=============================");
    }
}
