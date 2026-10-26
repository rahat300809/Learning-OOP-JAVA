public class Student {
    String name="rahat";
    int id=11;
    static String university="DIU";

    Student(String n,int i)
    {
        name=n;
        id=i;
    }

    void display()
    {
        System.out.println(name);
        System.out.println(id);
        System.out.println(university);
    }
}
