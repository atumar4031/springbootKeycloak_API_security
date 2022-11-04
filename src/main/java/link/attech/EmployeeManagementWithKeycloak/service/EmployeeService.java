package link.attech.EmployeeManagementWithKeycloak.service;

import link.attech.EmployeeManagementWithKeycloak.entity.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {
    ResponseEntity<Employee> createEmployee(Employee employee);
    ResponseEntity<Employee> getEmployeeById(int employeeId);
    ResponseEntity<List<Employee>> getEmployees();
}
