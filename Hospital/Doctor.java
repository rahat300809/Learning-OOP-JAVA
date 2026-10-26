public class Doctor extends Employee{

    private String dept;
    Doctor(String name,String dept,int salary)
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
