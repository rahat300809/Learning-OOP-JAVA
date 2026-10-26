public class rectriangle extends shape
{
    double length,width;
    rectriangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    
    double area()
    {
        return length*width;
    }
}