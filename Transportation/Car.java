public class Car extends Vehicle{

    private String fuel;

    Car(String no,String brand,int milage,String fuel)
    {
        super(no,brand,milage);
        this.fuel=fuel;
    }

    public void dispayDetails()
    {
        super.dispayDetails();
        System.out.println(fuel);
    }
}
