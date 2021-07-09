package com.example.employeedetails.repository;

import com.example.employeedetails.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;


public interface EmployeeRepo {
    Employee getEmployee(String userId);
    List<Employee> getEmployees();
    void addEmployee(Employee employee, String empId);
    void removeEmployee(String empId);
}
