public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();
        Instructor instructor = new Instructor();
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        student.setFirstName("levent");
        student.setLastName("Suncar");
        student2.setFirstName("test");
        student2.setLastName("test");

        InstructorManager instructorManager = new InstructorManager();

        instructorManager.add(instructor);
        instructorManager.get(instructor);


        UserManager studentManager = new StudentManager();

        studentManager.add(instructor);
        studentManager.get(student);

    }
}
