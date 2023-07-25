package com.example.Employee.repository;

import com.example.Employee.model.Employee;

import java.util.List;

public interface EmployeeRepository {

    public List<Employee> getAllEmployees();

    String counter();

    String sumSalary();

    String minSalary();

    String maxSalary();


    public List<Employee> getEmployeeHighSalary();

}
