package br.com.kiwm.springrestapi.service;

import br.com.kiwm.springrestapi.model.Employee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl  implements EmployeeService {
    private static List<Employee> list = new ArrayList<>();

    static {
        Employee e = new Employee();
        e.setAge(23);
        e.setDepartment("IT");
        e.setEmail("email@test.com");
        e.setLocation("br");
        e.setName("jose");
        list.add(e);

        e = new Employee();
        e.setAge(50);
        e.setDepartment("IT");
        e.setEmail("123@test.com");
        e.setLocation("US");
        e.setName("maria");
        list.add(e);
    }


    @Override
    public List<Employee> getEmployees() {
        return list;
    }
}
