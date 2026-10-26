public class Circle extends Shape{
  

   Circle(double radius)
    {

        super(radius,radius);
    }

    void area()
    {
        double result=Math.PI*dim1*dim2;
        System.out.println("CIRCLE: "+result);
    }
    

}
