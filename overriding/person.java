public class person {
    String name;
    String qualification;

    person(String name,String qualification)
    {
        this.name=name;
        this.qualification=qualification;
    }

    public void display()
    {
        System.out.println(name);
        System.out.println(qualification);
    }
}
