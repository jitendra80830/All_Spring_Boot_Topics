package com.transaction.rest;

import com.transaction.entities.Employee;
import com.transaction.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class Controller {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Employee> add(@RequestBody Employee employee){
        Employee addEmployee = employeeService.addEmployee(employee);

        return new ResponseEntity<>(addEmployee , HttpStatus.CREATED);

    }
}
