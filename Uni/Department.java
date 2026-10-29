public class Department {
    private int deptid;
    public Professor professor;

    public Department(int deptid)
    {
        this.deptid=deptid;
    }

    public void addProfessor(Professor professor)
    {
        this.professor=professor;
    }

    public void display()
    {

        System.out.println(deptid);
        
        professor.display();
    }
}
