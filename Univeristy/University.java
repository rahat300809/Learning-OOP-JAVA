public class University {
    public String Name;
    public String Location;

    University(String Name,String Location)
    {
        this.Name=Name;
        this.Location=Location;
    }

    public void Display()
    {
        System.out.println(Name);
        System.out.println(Location);
         
    }
}
