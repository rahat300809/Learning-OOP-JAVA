public class Discount extends Fare{
    private double discount;

    Discount(String name,double fare,double discount)
    {
        super(name,fare);
        this.discount=discount;
    }

    public double calculateFinal()
    {
        return getFare()-(getFare()*(discount*.01));
    }
    public void display()
    {
        super.display();
        System.out.println("FinalFare: "+calculateFinal());
    }
}
