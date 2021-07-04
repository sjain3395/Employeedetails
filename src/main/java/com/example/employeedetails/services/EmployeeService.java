package com.example.employeedetails.services;

import com.example.employeedetails.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

/**
 * Created by ritjain on 6/25/2021.
 */
public interface EmployeeService {
    Employee getEmployee(String userId);
    void addEmployee(Employee employee, String empId);
    List<Employee> getEmployees();
    void removeEmployee (String empId);

}


