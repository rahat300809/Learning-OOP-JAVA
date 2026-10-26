 

public class Car {
    private String brand;
    private String model;
    private Engine engine;

    public Car(String brand,String model,String capacity,String engineNumber)
    {
        this.brand=brand;
        this.model=model;
        this.engine=new Engine(engineNumber,capacity);
    }
    public void diplayCar()
    {
        System.out.println(brand+" "+model+" ");
        engine.displayEngine();
    }
}
