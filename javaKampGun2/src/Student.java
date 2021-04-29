//Öğrenci nesnesi
public class Student {

    Long id;
    String firstname;
    String lastname;
    String email;
    Instructor instructor;


    //All args cons
    public Student(Long id, String firstname, String lastname, String email, Instructor instructor) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.instructor = instructor;
    }

    //No args cons
    public Student() {
    }
}
