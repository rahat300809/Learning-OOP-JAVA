public class Vehicle {
    private String no;
    private String brand;
    private int milage;
    

    Vehicle(String no,String brand,int milage)
    {
        this.no=no;
        this.brand=brand;
        this.milage=milage;
        
    }

    public void dispayDetails()
    {
        System.out.println(no);
        System.out.println(brand);
        System.out.println(milage);
       
    }


}
