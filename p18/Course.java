import java.util.ArrayList;
public class Course {

    private int code;
    private String title;
    private int credit;
    ArrayList<Student>student=new ArrayList<>();

    public Course(int code,String title,int credit)
    {
        this.code=code;
        this.title=title;
        this.credit=credit;
    }
}
