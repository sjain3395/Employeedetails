package com.example.employeedetails.services.Impl;

import com.example.employeedetails.model.Employee;
import com.example.employeedetails.repository.EmployeeRepo;
import com.example.employeedetails.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

/**
 * Created by ritjain on 6/25/2021.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;


    public Employee getEmployee(String empId) {
        Employee employee = employeeRepo.getEmployee(empId);
        return employee;
    }

    public void addEmployee(Employee employee, String empId) {
        employeeRepo.addEmployee(employee, empId);
    }

    public List<Employee> getEmployees() {
        return employeeRepo.getEmployees();
    }

    @Override
    public void removeEmployee(String empId) {
        employeeRepo.removeEmployee(empId);

    }




}
