public class teacher {
    String name="rahat";
    int age=20;
    int salary=50000;
    
    public void set_value(String name,int age,int salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;

    }
    public void print()
    {
        System.out.println("name= "+ name);
        System.out.println("age= "+ age);
    }
}
