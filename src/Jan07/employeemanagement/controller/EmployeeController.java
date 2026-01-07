
package Jan07.employeemanagement.controller;

import Jan07.employeemanagement.model.Employee;
import Jan07.employeemanagement.service.EmployeeService;




public class EmployeeController {
    public Employee create(Employee e){
        EmployeeService eservice = new EmployeeService();
        return eservice.save(e);
        
    }
}
