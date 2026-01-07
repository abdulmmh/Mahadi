
package Jan07.employeemanagement.service;


import Jan07.employeemanagement.dao.EmployeeDAO;
import Jan07.employeemanagement.model.Employee;



public class EmployeeService {
    public Employee save(Employee e){
        EmployeeDAO edao = new EmployeeDAO();
        return edao.insert(e);
    }
}
