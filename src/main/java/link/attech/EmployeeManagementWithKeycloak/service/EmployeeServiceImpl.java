package link.attech.EmployeeManagementWithKeycloak.service;

import link.attech.EmployeeManagementWithKeycloak.entity.Employee;
import link.attech.EmployeeManagementWithKeycloak.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public ResponseEntity<Employee> createEmployee(Employee employee) {
        return ResponseEntity.ok(employeeRepository.save(employee));
    }

    @Override
    public ResponseEntity<Employee> getEmployeeById(int employeeId) {
        Employee employee =employeeRepository.findById(employeeId)
                .orElseThrow(() -> new RuntimeException("empployee not found"));
        return ResponseEntity.ok(employee);
    }

    @Override
    public ResponseEntity<List<Employee>> getEmployees() {
        List<Employee> employee =employeeRepository.findAll();
        return ResponseEntity.ok(employee);
    }

}
