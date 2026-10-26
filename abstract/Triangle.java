public class Triangle extends Shape {

    Triangle(double dm1,double dm2)
    {
        super(dm1,dm2);
    }

    void area()
    {
        double result= .5*dim1*dim2;
        System.out.println("Present area: "+result);
    }
}
