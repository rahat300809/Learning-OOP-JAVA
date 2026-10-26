public class person {
    private String name;
    private int age;

    public void setData(String name)
    {
        this.name=name;
    }
    public String getData()
    {
        return name;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
