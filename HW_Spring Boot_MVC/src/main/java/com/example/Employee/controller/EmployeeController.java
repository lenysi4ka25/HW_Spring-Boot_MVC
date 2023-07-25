package com.example.Employee.controller;

import com.example.Employee.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String getAll() {
        return employeeService.getAllEmployees().toString();
    }

    @GetMapping("/employee")
    public String showCounter() {
        return employeeService.counter();
    }

    @GetMapping("/salary/sum")
    public String getSalary() {
        return employeeService.sumSalary();
    }

    @GetMapping("/salary/min")
    public String getMinSalary() {
        return employeeService.minSalary().toLowerCase();
    }

    @GetMapping("/salary/max")
    public String getMaxSalary() {
        return employeeService.maxSalary();
    }

    @GetMapping("/salary/highSalary")
    public String getHighSalary() {
        return employeeService.getEmployeeHighSalary().toString();
    }

}

