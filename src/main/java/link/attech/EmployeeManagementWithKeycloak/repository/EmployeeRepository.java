package link.attech.EmployeeManagementWithKeycloak.repository;

import link.attech.EmployeeManagementWithKeycloak.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
