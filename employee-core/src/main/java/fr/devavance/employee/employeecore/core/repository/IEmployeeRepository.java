package fr.devavance.employee.employeecore.core.repository;


import fr.devavance.employee.employeecore.core.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
}
