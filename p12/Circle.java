public class Circle implements Shape{
    public int radius;
    public double pi;
    public Circle(int radius)
    { 
        this.radius=radius;
        pi=3.1416;
    }

    public double calculateArea()
    {

        return pi*(radius*radius);
    }
    public void display()
    {
        System.out.println("circle: "+calculateArea());
    }
        
  
   
}
