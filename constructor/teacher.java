public class teacher
{
    String name;
    int age;

    teacher(String name,int age)
    {
       this.name=name;
       this.age=age;
    }
    teacher()
    {
        System.out.println("No val");
    }
    

    public void print()
    {
        System.out.println(name);
    }
}