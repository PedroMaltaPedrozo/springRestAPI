package br.com.kiwm.springrestapi.service;

import br.com.kiwm.springrestapi.model.Employee;
import br.com.kiwm.springrestapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl  implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee GetSingleEmployee(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()) {
            return employee.get();
        }
        throw new RuntimeException("Employee is not found for the id " + id);
    }

    @Override
    public void deleteEmployee(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()) {
            employeeRepository.deleteById(id);
        }
        throw new RuntimeException("Employee is not found for the id " + id);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        employee.setId(id);
        Optional<Employee> employeeTest = employeeRepository.findById(id);
        if (employeeTest.isPresent()) {
            return employeeRepository.save(employee);
        }
        throw new RuntimeException("Employee is not found for the id " + id);
    }
}
