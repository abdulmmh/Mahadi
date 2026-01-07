
package Jan07;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
       ReturnValue rt = new ReturnValue();
       Map<Integer, Student> student = rt.getStudent();
       
        System.out.println(student);

        
       
    }
    
    
}
class Student{
    private int roll;
    private String name;
    private String group;

    public Student(int roll, String name, String group) {
        this.roll = roll;
        this.name = name;
        this.group = group;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" + "roll=" + roll + ", name=" + name + ", group=" + group + '}';
    }
    
}

interface SetValue{
    Map<Integer, Student>  getStudent();
}

class ReturnValue implements SetValue{

    @Override
    public Map<Integer, Student> getStudent() {
        Map<Integer, Student> st = new HashMap<>();
        st.put(1, new Student(1219, "Mahadi", "Science"));
        st.put(2, new Student(1220, "Hasan", "Science"));
        st.put(3, new Student(1221, "Abdullah", "Science"));
        return st;
    }
    
}
