 

public class volvo extends vehicle {

    private double price;
    volvo(double price,String model)
    {
        super(model);

        this.price=price;
    }

    public void display()
    {
        super.display();
        System.out.println(price);
         
    }
    public static void main(String[] args) {
        vehicle v = new volvo(10000,"CHR");

        v.display();
         
    }
    
}
