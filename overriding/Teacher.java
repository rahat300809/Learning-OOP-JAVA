public class Teacher extends person {
    int salary;
    String dept;
    
    Teacher(int salary,String dept,String name,String qualification)
    {
        super(name,qualification);
        this.salary=salary;
        this.dept=dept;
        
    }

    @Override
    public void display()
    {
        System.out.println(salary);
        System.out.println(dept);
        super.display();
        
    }


}
