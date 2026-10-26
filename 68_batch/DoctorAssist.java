public class DoctorAssist extends Employee {
    String dept;

    public DoctorAssist(String name, int id, String dept)
    {
        super(id,name);
        this.dept=dept;
    }
    public void display()
    {
        super.display();
        System.out.println("dept: "+dept);
    }
   
}
