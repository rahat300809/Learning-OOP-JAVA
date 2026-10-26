public abstract class Fare {
    private String name;
    private double  fare;

    Fare(String name,double fare)
    {
        this.name=name;
        this.fare=fare;
    }
    public double getFare()
    {
        return fare;
    }
    abstract public double calculateFinal();
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("fare: "+fare);
    }
}
