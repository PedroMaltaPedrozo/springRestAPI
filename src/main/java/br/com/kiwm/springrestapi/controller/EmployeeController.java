package br.com.kiwm.springrestapi.controller;

import org.springframework.web.bind.annotation.*;

//@Controller
@RestController // == @Controller + @ResponseBody in every method.
public class EmployeeController {

    //@RequestMapping(value = "/employees", method = RequestMethod.GET)
    @GetMapping("/employees")
    public String getEmployees() {
        return "employees";
    }

    @GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable Long id) {
        return "Fetching the employee details for the id " + id;
    }

    //localhost:8080/employees?id=34
    @DeleteMapping("/employees")
    public String deleteEmployee(@RequestParam Long id) {
        return "Deleting the employee details for the id "+ id;
    }
}
