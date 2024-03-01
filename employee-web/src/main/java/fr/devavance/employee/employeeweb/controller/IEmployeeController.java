package fr.devavance.employee.employeeweb.controller;

import ch.qos.logback.core.model.Model;
import fr.devavance.employee.employeecore.core.entity.Employee;


public interface IEmployeeController {

    public String displayHome(Model model);
    public String addEmployee(Employee employee);
}
