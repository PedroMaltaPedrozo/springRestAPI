package br.com.kiwm.springrestapi.service;

import br.com.kiwm.springrestapi.model.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();
}
