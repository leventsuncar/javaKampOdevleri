public class Student extends User {
    private String studentNumber;

    public Student(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Student() {
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
