public class rectrangle extends shape{
   
    rectrangle(double dim1,double dim2)
    {
        super(dim1,dim2);
    }

    void area()
    {
        double result = dim1*dim2;
        System.out.println("result" + result);
    }
}
