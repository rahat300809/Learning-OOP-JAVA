public class Train extends Vehicle{
    private int distance;
    public Train(int vehicleNumber,String routeName,int distance)
    {
        super(vehicleNumber,routeName);
        this.distance=distance;
    }

    public int calculateFare(int distance)
    {

        return (distance*3);
    }
    void display()
    {
        super.display();
        System.out.println("fare train: "+calculateFare(distance));
    }

}
