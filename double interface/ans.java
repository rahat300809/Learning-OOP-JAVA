public class ans  implements   interface1,interface2{
    int val1,val2;

    ans(int val1,int val2)
    {
        this.val1=val1;
        this.val2=val2;
    }

    public int add()
    {

        return val1+val2;
    }

    public int multiply()
    {
        return val1*val2;
    }

    public int total()
    {
        return(multiply()+add());
    }

    @Oveerride
    public void display()
    {

        System.out.println("add="+add());
        System.out.println("multiply="+multiply());
        System.out.println("total="+total());
    }

    
}
