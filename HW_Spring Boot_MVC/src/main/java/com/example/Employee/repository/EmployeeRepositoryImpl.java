package com.example.Employee.repository;

import com.example.Employee.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final List<Employee> employeeList = List.of(
            new Employee("Катя", 90_000),
            new Employee("Дима", 102_000),
            new Employee("Олег", 80_000),
            new Employee("Вика", 165_000),
            new Employee("Сергей", 115_000),
            new Employee("Алксей", 100_000));

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeList);
    }

    @Override
    public String counter() {
        return "counterEmployees - " + employeeList.size();
    }

    @Override
    public String sumSalary() {
        return "sumSalary - " + employeeList
                .stream()
                .map(Employee::getSalary)
                .mapToInt(Integer::intValue)
                .sum();
    }

    @Override
    public String minSalary() {
        return "minSalary - " + employeeList
                .stream()
                .map(Employee::getSalary)
                .mapToInt(Integer::intValue)
                .min();
    }


    @Override
    public String maxSalary() {
        return "maxSalary - " + employeeList
                .stream()
                .map(Employee::getSalary)
                .mapToInt(Integer::intValue)
                .max();
    }

    @Override
    public List<Employee> getEmployeeHighSalary() {
        OptionalDouble averageSalary = employeeList
                .stream()
                .map(Employee::getSalary)
                .mapToInt(Integer::intValue)
                .average();
        return employeeList
                .stream()
                .filter(x -> x.getSalary() >= averageSalary.getAsDouble())
                .collect(Collectors.toList());
    }

}
