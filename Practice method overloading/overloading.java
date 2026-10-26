public class overloading {
    int a,b,c;
    overloading(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

    overloading(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public int tot(int a)
    {
        
        return a*b*c;
    }

    public int tot(int a,int b)
    {
        return a+b;
    }
}
