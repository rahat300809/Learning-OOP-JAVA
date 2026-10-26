public class ElectricCar extends Car{

    private int batteryCapacity;

    ElectricCar(String no,String brand,int milage,String fuel,int batteryCapacity)
    {
        super(no,brand,milage,fuel);
        this.batteryCapacity=batteryCapacity;
    }

    public void dispayDetails()
    {
        super.dispayDetails();
        System.out.println(batteryCapacity);
    }
}
