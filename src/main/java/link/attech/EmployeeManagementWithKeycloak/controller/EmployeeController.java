package link.attech.EmployeeManagementWithKeycloak.controller;

import link.attech.EmployeeManagementWithKeycloak.entity.Employee;
import link.attech.EmployeeManagementWithKeycloak.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping(value = "/{employeeId}") // user role
    @RolesAllowed("user")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int employeeId){
        return employeeService.getEmployeeById(employeeId);
    }

    @GetMapping // admin role only
    @RolesAllowed("admin")
    public ResponseEntity<List<Employee>> getEmployees(){
        return employeeService.getEmployees();
    }

}
