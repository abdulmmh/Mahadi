
package Jan19.studentmgt.service;


import Jan19.studentmgt.dao.StudentDAO;
import Jan19.studentmgt.ui.Student;

public class StudentService {
    public Student save(Student student){
        StudentDAO stdao = new StudentDAO();
        return  stdao.insert(student);
    }
}
