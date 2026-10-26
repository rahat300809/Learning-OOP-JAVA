 

public class run {
    public static void main(String[] args) {
        Employee e= new Doctor("Rahat","Brain",100000);
        Employee a=new Assistant("Hello","Brain",40000);

        e.display();
        a.display();
    }
}
