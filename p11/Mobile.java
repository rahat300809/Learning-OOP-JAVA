
public class Mobile {
    private String brand;
    private String model;
    private int price;

    public Mobile(String brand,String model,int price)
    {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    public void displayInfo()
    {
        System.out.println(brand+" "+model+" "+price);
    }
}
