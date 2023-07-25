package com.example.Employee.service;

import com.example.Employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    String counter();

    String sumSalary();

    String minSalary();

    String maxSalary();

    List<Employee> getEmployeeHighSalary();
}
