public class Student {
    private String name;
    private int roll;
    private int marks;

    public Student(String name,int roll,int marks)
    {
        this.name=name;
        this.roll=roll;
        this.marks=marks;
    }

    public String CalculateGrade()
    {
        if(marks>80 && marks<=100)
        {
            return "A+";
        }
        else 
            return "a";
    }
    public void display()
    {
        System.out.println(name+" "+roll+" "+marks+" "+CalculateGrade());
    }
}
