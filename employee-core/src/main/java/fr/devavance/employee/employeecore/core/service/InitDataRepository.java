package fr.devavance.employee.employeecore.core.service;
import fr.devavance.employee.employeecore.core.enumeration.Fonction;
import fr.devavance.employee.employeecore.core.repository.IEmployeeRepository;
import fr.devavance.employee.employeecore.core.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class InitDataRepository implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {

        employeeRepository.save(new Employee(1, "Karim Mahmoud", "Egypt", "kmshawky20@gmail.com", "0097450413948", Fonction.DEV_WEB));
        employeeRepository.save(new Employee(2, "Fran Wilson", "C/ Araquil, 67, Madrid, Spain", "franwilson@mail.com", "(204) 619-5731", Fonction.DEV_OPS));
        employeeRepository.save(new Employee(3, "Maria Anders", "25, rue Lauriston, Paris, France", "mariaanders@mail.com", "(503) 555-9931", Fonction.CHEF_PROJET));
        employeeRepository.save(new Employee(4, "Thomas Hardy", "89 Chiaroscuro Rd, Portland, USA", "thomashardy@mail.com", "(171) 555-2222", Fonction.DEV_AI));
        employeeRepository.save(new Employee(5, "Ahmed Omar", "KSA", "amhedoomar@gmail.com", "0096650413948", Fonction.SOFTWARE_ARCHITECT));
        employeeRepository.save(new Employee(6, "Idam Wilson", "C/ Araquil, 67, Madrid, Spain", "idamwilson@mail.com", "(204) 619-5331", Fonction.DEV_AI));
        employeeRepository.save(new Employee(7, "Peter Perrier", "Obere Str. 57, Berlin, Germany", "peterperrier@mail.com", "(313) 555-5735", Fonction.DEV_WEB));
        employeeRepository.save(new Employee(8, "Mark Hardy", "89 Chiaroscuro Rd, Portland, USA", "markshardy@mail.com", "(171) 555-2222", Fonction.DEV_OPS));

    }
    @Autowired
    private IEmployeeRepository employeeRepository;
}
