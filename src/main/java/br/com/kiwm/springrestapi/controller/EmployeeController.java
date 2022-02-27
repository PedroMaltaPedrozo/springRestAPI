package br.com.kiwm.springrestapi.controller;

import br.com.kiwm.springrestapi.model.Employee;
import br.com.kiwm.springrestapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.GetSingleEmployee(id);
    }

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    //localhost:8080/employees?id=34
    @DeleteMapping("/employees")
    public void deleteEmployee(@RequestParam Long id) {
        employeeService.deleteEmployee(id);
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return  employeeService.updateEmployee(id, employee);
    }
}
