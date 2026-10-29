public class Main {
    public static void main(String[] args) {
        
        Department d=new Department(1);
        Course c=new Course(101,3);
        Professor p=new Professor(1111);
        d.addProfessor(p);
        p.addCourse(c);

        d.display();
        


    }
}
