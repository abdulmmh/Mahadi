
package Jan19.studentmgt.dao;


import Jan19.studentmgt.ui.Student;
import Jan19.studentmgt.util.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {
    public Student insert(Student student){
        int id = student.getStudentId();
        String name = student.getStudent_name();
        String subject = student.getSubject();
        double marks = student.getMarks();
        double fees = student.getFees();
        String sql = "INSERT INTO STUDENT_INFORMATION (student_id, student_name, subject, marks, fees) VALUES" +
                "('"+id+"', '"+name+"', '"+subject+"', '"+marks+"', '"+fees+"')";
        try {
            Connection connection = DBConnection.getConnection();

            Statement stmt = connection.createStatement();
            int status = stmt.executeUpdate(sql);

            if (status > 0) {
                System.out.println("inserted");
            }else{
                System.out.println("failed");
            }
        } catch (SQLException ce) {
            System.out.println(ce.getMessage());
        }
        return student;
    }
}
