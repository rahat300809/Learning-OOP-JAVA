public class Professor {
    private int id;
    public Course course;

    public Professor(int id)
    {
        this.id=id;
        
    }
    public void addCourse(Course course)
    {
        this.course=course;
    }
    public void display()
    {

        System.out.println(id);
        course.display();
    }
}
