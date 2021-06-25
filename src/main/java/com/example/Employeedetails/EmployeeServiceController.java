package com.example.Employeedetails;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@RestController
public class EmployeeServiceController {
    private static Map<String, Employee> employeeRepo = new HashMap<>();

    static {
        Employee anup = new Employee();
        anup.setId("1");
        anup.setName("Anup");
        anup.setSalary(50000);
        anup.setEmail("Anup123@gmail.com");
        employeeRepo.put(anup.getId(), anup);

        Employee ankit = new Employee();
        ankit.setId("2");
        ankit.setName("Ankit");
        ankit.setSalary(52000);
        ankit.setEmail("Ankit123@gmail.com");
        employeeRepo.put(ankit.getId(), ankit);
    }

    @RequestMapping(value = "/employee")
    public ResponseEntity<Objects> getProduct() {
        return new ResponseEntity(employeeRepo.values(), HttpStatus.OK);

    }
    @RequestMapping(value = "/employee" , method = RequestMethod.POST)
    public ResponseEntity<Object>createEmployee(@RequestBody Employee employee){
        employeeRepo.put(employee.getId(), employee);
        return new ResponseEntity("Employee Details Is created successful",HttpStatus.CREATED);
    }
}
