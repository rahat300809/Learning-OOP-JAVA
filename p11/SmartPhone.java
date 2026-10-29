 

public class SmartPhone extends Mobile{

    int ram;
    int cam;

    public SmartPhone(String brand,String model,int price,int ram,int cam)
    {
        super(brand,model,price);
        this.ram=ram;
        this.cam=cam;
    }

    public void displayInfo()
    {
        super.displayInfo();
        System.out.println(ram+" "+cam);
    }
    
}
