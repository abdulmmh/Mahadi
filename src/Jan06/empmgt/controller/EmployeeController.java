
package Jan06.empmgt.controller;

import Jan06.empmgt.model.Employee;
import Jan06.empmgt.service.EmployeeService;


public class EmployeeController {
    public Employee create(Employee e){
        EmployeeService es = new EmployeeService();
        return es.save(e);
    }
}
