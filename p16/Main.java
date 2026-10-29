public class Main {
    public static void main(String[] args) {
        School school=new School();

        Student s1=new Student("Rahat",101,85);
        Student s2=new Student("Mahamud",102,85);
        Student s3=new Student("Pranto",103,85);

        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s2);

        school.displayAll();
    }
}
