package fr.devavance.employee.employeecore.core.service;

import fr.devavance.employee.employeecore.core.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    public List<Employee> findAll();
    public void save(Employee employee);
    public Employee findById(Long id);
    public void delete(Long id);
}