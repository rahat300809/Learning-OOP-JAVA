 

public class Rectirangle implements Shape{
    public int length;
    public int width;
    public Rectirangle(int length,int width)
    {
        this.length=length;
        this.width=width;
    }

    public double calculateArea()
    {
        return length*width;
    }
    void display()
    {
        System.out.println("rectriangle: "+calculateArea());
    }

}
