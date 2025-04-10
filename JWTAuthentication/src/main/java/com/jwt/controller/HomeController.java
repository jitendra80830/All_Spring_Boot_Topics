package com.jwt.controller;

import com.jwt.model.Employee;
import com.jwt.services.EmployeeServices;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/welcome")
@AllArgsConstructor
public class HomeController {

    @Autowired
    private EmployeeServices employeeServices;

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/employee")
    public List<Employee> home() {
        logger.info("========================= Get Employee List =======================");
        return employeeServices.getEmployeeList();
    }
}
