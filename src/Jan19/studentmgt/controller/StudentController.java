
package Jan19.studentmgt.controller;



import Jan19.studentmgt.service.StudentService;
import Jan19.studentmgt.ui.Student;

public class StudentController {
    public Student create(Student student){
        StudentService stservice = new StudentService();
        return stservice.save(student);
    }
}
