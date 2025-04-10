package com.jwt.services;

import com.jwt.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServices {

    private List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList() {
        employeeList.add(new Employee(101, "jitendra", "jitendra@gmail.com"));
        employeeList.add(new Employee(102, "pawan", "pawan@gmail.com"));
        return employeeList;

    }
}
