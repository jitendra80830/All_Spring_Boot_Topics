package com.transaction.service;

import com.transaction.entities.Address;
import com.transaction.entities.Employee;
import com.transaction.repo.AddressRepository;
import com.transaction.repo.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AddressService addressService;

    @Transactional
    public Employee addEmployee(Employee employee) {
        Employee employeeSavedToDB = employeeRepository.save(employee);

        Address address = new Address();
        address.setAddress("Noida");
        address.setEmployee(employee);

        addressService.addAddress(address);
        return employeeSavedToDB;
    }

}
