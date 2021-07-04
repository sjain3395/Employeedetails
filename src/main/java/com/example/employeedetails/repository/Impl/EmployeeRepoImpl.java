package com.example.employeedetails.repository.Impl;

import com.example.employeedetails.model.Employee;
import com.example.employeedetails.repository.EmployeeRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ritjain on 6/25/2021.
 */

@Repository("employeeRepo")
public class EmployeeRepoImpl implements EmployeeRepo {
    static List<Employee> employeeList = new ArrayList<>();

    Logger  logger = LoggerFactory.getLogger(EmployeeRepoImpl.class);

    public  Employee getEmployee( String empId) {
        List<Employee> employeeList = getEmployeeList();
        Employee employee = new Employee();
        for (int i = 0; i < employeeList.size(); i++) {
            employee = employeeList.get(i);
            if (employee.getId().equalsIgnoreCase(empId)) {
                return employee;
            }

        }
        return employee;
    }

    @Override
    public List<Employee> getEmployees() {

        List<Employee> employeeList = getEmployeeList();

        return employeeList;
    }

    private List<Employee> getEmployeeList() {

        Employee employee = new Employee();
        employee.setEmail("sj@gmail.com");
        employee.setId("1");
        employee.setName("shripal");
        employee.setSalary(1234567890);

        employeeList.add(employee);

        employee = new Employee();
        employee.setEmail("sj@gmail.com");
        employee.setId("2");
        employee.setName("shripal2");
        employee.setSalary(7654321);

        employeeList.add(employee);
        employee = new Employee();
        employee.setEmail("sj@gmail.com");
        employee.setId("3");
        employee.setName("shripal3");
        employee.setSalary(98763456);

        employeeList.add(employee);
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee, String empId) {
        ///add succ
        try {
            employeeList.add(employee);
            logger.debug("Employee added successfully");
        } catch (Exception e) {
            logger.error("Error in adding employee", e);
        }

    }

    @Override
    public void removeEmployee(String empId) {

        employeeList.remove(empId);

    }


}
