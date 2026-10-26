public class Professor extends Person implements Classroom{

    public String title;

    Professor(String fname,String iname)
    {
        super(fname,iname);
    }
    public void getTitle(String title)
    {
        this.title=title;
    }

    @Override
    public void teaching()
    {
        System.out.println(fname +" "+ iname + "is teaching");
         
    }

    @Override
    public void reading()
    {
        System.out.println(fname +  " " + iname + "is reading");
    }

    public static void main(String[] args)
    {
        Professor professor=new Professor("rahat","R");
        professor.getTitle("PHD");
        professor.teaching();
        professor.reading();
    }
    
}
