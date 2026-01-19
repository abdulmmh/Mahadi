
package Jan19.studentmgt.ui;


public class Student {
    private int studentId;
    private String student_name;
    private String subject;
    private double marks;
    private double fees;

    public Student(int studentId, String student_name, String subject, double marks, double fees) {
        this.studentId = studentId;
        this.student_name = student_name;
        this.subject = subject;
        this.marks = marks;
        this.fees = fees;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    } 
}
