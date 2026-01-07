
package Jan06.empmgt.service;

import Jan06.empmgt.dao.EmployeeDAO;
import Jan06.empmgt.model.Employee;


public class EmployeeService {
    public Employee save(Employee e){
        EmployeeDAO em = new EmployeeDAO();
        return em.insert(e);
    }
}
