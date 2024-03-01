package fr.devavance.employee.employeeweb.controller.implementation;

import fr.devavance.employee.employeecore.core.entity.Employee;
import fr.devavance.employee.employeecore.core.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    private final IEmployeeService employeecontroller;

    @Autowired
    public EmployeeController(IEmployeeService employeeService) {
        this.employeecontroller = employeeService;
    }

    @GetMapping("/")
    public String showEmployeeNames(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("employees", employeecontroller.findAll());
        return "view_home";
    }

    @PostMapping("/addemployee")
    public String addEmployee(Employee employee) {
        employeecontroller.save(employee);
        return "redirect:/";
    }

    @GetMapping("/employees")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeecontroller.findAll());
        return "view_employee";
    }

    @GetMapping("/employee/{id}")
    public String displayEmployee(@PathVariable(name="id") Long id, Model model) {
        model.addAttribute("employee", employeecontroller.findById(id));
        return "view_employee";
    }
}
