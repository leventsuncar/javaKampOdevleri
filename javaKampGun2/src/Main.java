public class Main {

    public static void main(String[] args) {

        Instructor instructor = new Instructor(1L, "Engin", "Demiroğ");
        //InstructorManager Classının çağırılması
        InstructorManager instructorManager = new InstructorManager();
        //StudentManager Classının çağırılması
        StudentManager studentManager = new StudentManager();
        Student student1 = new Student(1L, "Levent", "Suncar", "levent@levent.com", instructor);
        Student student2 = new Student(2L, "test1", "Suncar", "levent@levent.com", instructor);
        Student student3 = new Student(3L, "test2", "Suncar", "levent@levent.com", instructor);
        Student student4 = new Student(4L, "test3", "Suncar", "levent@levent.com", instructor);
        Student student5 = new Student(5L, "test4", "Suncar", "levent@levent.com", instructor);

        //Öğrenci dizisi
        Student students[] = {student1, student2, student3, student4, student5};

        //Ögrencileri yazdırmak için for döngüsü
        for (Student student : students) {
            //Öğrenciyi yazdırma metodu
            studentManager.getAllStudents(student);
        }
        //Eğitmeni yazdırma metodu
        instructorManager.getInstructor(instructor);
    }
}
