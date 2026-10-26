public class Customer
{
    private int cusid;
    private String name;
    private String catagory;

    Customer(int cusid,String name)
    {
        this.cusid=cusid;
        this.name=name;
        
    }
    public void setCat(String catagory)
    {
        this.catagory=catagory;
    }
    public String getCat()
    {
        return catagory;
    }


    public void display()
    {
        System.out.println(cusid+"\n"+"\n"+name+"\n");
    }

    public static void main(String[] args) {
        Customer c1=new Customer(111,"RAHAT");
        c1.setCat("Student");
        c1.display();
        System.out.println(c1.getCat());

        
    }

}