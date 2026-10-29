public class Vehicle {
    private int vehicleNumber;
    public String routeName;

    public Vehicle(int vehicleNumber,String routeName)
    {

        this.vehicleNumber=vehicleNumber;
        this.routeName=routeName;
    }

    void display()
    {
        System.out.println(vehicleNumber+" "+routeName);
    }
    public int calcualteFare(int distance)
    {
        return 0;
    }

}
