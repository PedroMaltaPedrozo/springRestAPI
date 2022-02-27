package br.com.kiwm.springrestapi.service;

import br.com.kiwm.springrestapi.model.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();

    Employee saveEmployee(Employee employee);

    Employee GetSingleEmployee(Long id);

    void deleteEmployee(Long id);

    Employee updateEmployee(Long id, Employee employee);
}


