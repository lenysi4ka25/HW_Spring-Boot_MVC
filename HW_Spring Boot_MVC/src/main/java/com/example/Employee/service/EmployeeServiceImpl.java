package com.example.Employee.service;

import com.example.Employee.model.Employee;
import com.example.Employee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public String counter() {
        return employeeRepository.counter();
    }

    @Override
    public String sumSalary() {
        return employeeRepository.sumSalary();
    }

    @Override
    public String minSalary() {
        return employeeRepository.minSalary();
    }

    @Override
    public String maxSalary() {
        return employeeRepository.maxSalary();
    }

    @Override
    public List<Employee> getEmployeeHighSalary() {
        return employeeRepository.getEmployeeHighSalary();
    }


}
