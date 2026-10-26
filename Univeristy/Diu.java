public class Diu extends University{

    public String faculty;
    public String dept;
    public int no_of_student;
    public Canteen c;

    Diu(String Name,String Location,String faculty,String dept,int no_of_student)
    {
        super(Name,Location);
        this.faculty=faculty;
        this.dept=dept;
        this.no_of_student=no_of_student;
        c=new Canteen("DIU Canteen",50,30);
    }

    @Override
    public void Display()
    {
        
        System.out.println("Faculty: "+faculty);
        System.out.println("Department: "+dept);
        System.out.println("Students: "+no_of_student);
        c.Display();
    }

    public static void main(String[] args) {
        University d=new Diu("DIU","Dhaka","Science and Engineering","CSE",20000);
        d.Display();
        
        
    }
}
