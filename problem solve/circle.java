public class circle extends shape{

    circle(double dim1,double dim2)
    {
        super(dim1,dim1);
    }

    void area()
    {
        double result=Math.PI*dim1*dim2;
        System.out.println(result);
    }
}
