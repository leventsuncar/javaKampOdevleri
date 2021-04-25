public class StudentManager {


    public void getAllStudents(Student student) {
        System.out.println("Öğrenci eklendi " +
                student.firstname + " " +
                student.lastname + " Eğitmen: " +
                student.instructor.firstname + " " +
                student.instructor.lastname);
    }


}
