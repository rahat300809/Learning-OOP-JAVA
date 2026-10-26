 

public class Professor extends person implements Classroom {

    String title;

    Professor(String fname,String lname)
    {
        super(fname,lname);
    }

    void getTitle(String title)
    {
        this.title=title;
    }

    @Override
    public void teaching()
    {
        System.out.println(fname + " " + lname + "is teaching");
    }

    @Override
    public void reading()
    {
        System.out.println(fname + " " + lname + "is reading");
    }

    public static void main(String[] args) {
        Professor p =new Professor("Rahat","Mahamud");

        p.getTitle("Professor");

        System.out.println("First Name: "+p.fname);
        System.out.println("Last Name: "+p.lname);
        System.out.println("Title: "+p.title);

        p.teaching();
        p.reading();

    }
    
}
