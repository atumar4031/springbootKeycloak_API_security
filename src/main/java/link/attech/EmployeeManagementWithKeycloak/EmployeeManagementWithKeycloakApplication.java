package link.attech.EmployeeManagementWithKeycloak;

import link.attech.EmployeeManagementWithKeycloak.entity.Employee;
import link.attech.EmployeeManagementWithKeycloak.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class EmployeeManagementWithKeycloakApplication {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementWithKeycloakApplication.class, args);
	}

	@PostConstruct
	public void initEmployees(){
		employeeRepository.saveAll(
				Stream.of(
						new Employee(1 , "Sayudi Aminu"),
						new Employee(1, "Ashiru Umar Imam"),
						new Employee(2 , "Hamza Shehu"),
						new Employee(3 , "Mubarak Abubakar Bunza"),
						new Employee(4 , "Abuzaid Yusuf")
				).collect(Collectors.toList())
		);
	}

}
