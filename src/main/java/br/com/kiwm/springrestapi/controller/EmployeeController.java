package br.com.kiwm.springrestapi.controller;

import br.com.kiwm.springrestapi.model.Employee;
import br.com.kiwm.springrestapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController // == @Controller + @ResponseBody in every method.
//@RequestMapping("/api/v1") == server.servlet.context-path=/api/v1 in properties.
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

/*
    @Value("${app.name: Employee Tracker}")
    private String appName;

    @Value("${app.version: version1}")
    private String appVersion;

    @GetMapping("/version")
    public String getAppDetails() {
        return appName + "-" + appVersion;
    }
*/

    //@RequestMapping(value = "/employees", method = RequestMethod.GET)
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable Long id) {
        return "Fetching the employee details for the id " + id;
    }

    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee) {
        return "saving the employee details to the database" + employee;
    }

    //localhost:8080/employees?id=34
    @DeleteMapping("/employees")
    public String deleteEmployee(@RequestParam Long id) {
        return "Deleting the employee details for the id " + id;
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        System.out.println("updating the employee data for the id " + id);
        return employee;
    }
}
