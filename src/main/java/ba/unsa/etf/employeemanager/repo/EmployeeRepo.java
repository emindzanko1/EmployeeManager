package ba.unsa.etf.employeemanager.repo;

import ba.unsa.etf.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
