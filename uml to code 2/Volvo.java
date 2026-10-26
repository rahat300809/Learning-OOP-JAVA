public class Volvo extends vehicle{
    double price;

    Volvo(double price,String model)
    {
        super(model);
        this.price=price;
    }
    @Override
    void display()
    {
        super.display();
        System.out.println(price);
    }
}
