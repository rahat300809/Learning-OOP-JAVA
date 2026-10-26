public class Employee {
    private String name;
    private int emp_ID;
    private double salary;

    public void setinfo(String name,int emp_ID,double salary)
    {
        this.name=name;
        this.emp_ID=emp_ID;
        this.salary=salary;
    }

    public void display()
    {
        System.out.println(name);
        System.out.println(emp_ID);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Employee e1=new Employee();

        e1.setinfo("Rahat",1100,100000);
        e1.display();

    }
}
