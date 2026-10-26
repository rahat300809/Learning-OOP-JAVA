 

public class Engine {
    private String engineNumber;
    private String capacity;

    public Engine(String engineNumber,String capacity )
    {
        this.engineNumber=engineNumber;
        this.capacity=capacity;
    }

    public void displayEngine()
    {
        System.out.println(engineNumber+" "+capacity);
    }
}
