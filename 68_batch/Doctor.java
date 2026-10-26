public class Doctor extends Employee {
    String about;
    String designation;

    public Doctor(String name, int id, String about, String designation) {
        super(id,name);
        this.about = about;
        this.designation = designation;
    }
    public void display()
    {
        super.display();
        System.out.println("about: "+about+"\ndesignation: "+designation);

    }
}
