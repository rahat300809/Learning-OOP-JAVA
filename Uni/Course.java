public class Course {
    private int code;
    private double credit;

    public Course(int code,int credit)
    {
        this.code=code;
        this.credit=credit;
    }
    public void display()
    {

        System.out.println(code);
        System.out.println(credit);
    }
}
