public class extnd extends data{
    String qualification;

    void setData(String name,int age,String qualification)
    {
        this.name=name;
        this.age=age;
        this.qualification=qualification;
    }
    void display2()
    {
        display();
        System.out.println(qualification);
    }
}
