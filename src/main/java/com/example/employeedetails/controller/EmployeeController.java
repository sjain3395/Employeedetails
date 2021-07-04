package com.example.employeedetails.controller;

import com.example.employeedetails.model.Employee;
import com.example.employeedetails.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ritjain on 6/25/2021.
 */
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path = "/get-employee")
    public Employee getEmployee(@RequestParam("employeeId") String employeeId) {
        Employee employee = employeeService.getEmployee(employeeId);
        return employee;
    }

    @ResponseStatus(value = HttpStatus.OK)
    @PostMapping(path = "/add-employee")
    public void addEmployee(@RequestBody Employee employee,
                            @RequestHeader(value = "employeeID", required = true) String empID) {
        employeeService.addEmployee(employee, empID);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path = "/get-employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @DeleteMapping(path = "/remove-employee/{id}")
    public void removeEmployee( @PathVariable("id")  String empId) {
        employeeService.removeEmployee(empId);


    }
}