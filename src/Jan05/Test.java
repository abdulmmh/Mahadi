
package Jan05;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Employer employer1 = new Employer(1001, "Masud", 20000000.00);
        Employer employer2 = new Employer(1002, "Tasrif", 25000000.00);
        Employer employer3 = new Employer(1003, "Zayed", 28000000.00);
        
        Set<Employer> emp = new HashSet<>();
        emp.add(employer1);
        emp.add(employer2);
        emp.add(employer3);
        
        System.out.println(emp);
    }
  
}
