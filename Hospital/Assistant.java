public class Assistant extends Employee{
    String dept;
    Assistant(String name,String dept,int salary)
    {
        super(name,salary);
        this.dept=dept;
    }

    public String getDept()
    {
        return dept;
    }

    @Override
    public void display()
    {
        System.out.println(getName() + " " + getSalary() + " "+ dept);
    }
}
