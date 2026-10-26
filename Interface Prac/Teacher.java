public class Teacher implements Public {
    String name;
    int salary;

    public void setData(String name,int salary)
    {
        this.name=name;
        this.salary=salary;

    }
    public void display()
    {
        System.out.println(name +" "+ salary);
    }


}
