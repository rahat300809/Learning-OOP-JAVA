public class Bus extends Vehicle {

    private int distance;
    public Bus(int vehicleNumber,String routeName,int distance)
    {
        super(vehicleNumber,routeName);
        this.distance=distance;
    }

    public int calculateFare(int distance)
    {

        return (distance*5);
    }

    void display()
    {
        super.display();
        System.out.println("fare bus: "+calculateFare(distance));
    }
}
