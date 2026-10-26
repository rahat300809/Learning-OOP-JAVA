public abstract class Employee {
    private String name;
     
    private int salary;

    
    Employee(String name,int salary)
    {
        this.name=name;
        this.salary=salary;
    }

    public String getName()
    {
        return name;
    }
    public int getSalary()
    {
        return salary;
    }
    public abstract void display();
}
