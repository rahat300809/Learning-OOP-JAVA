import java.util.ArrayList;
public class School {
    ArrayList<Student>student=new ArrayList<>();

    public void addStudent(Student s)
    {

        student.add(s);
    }

    public void displayAll()
    {
        for(Student s: student)
        {
            s.display();
        }
    }
}
