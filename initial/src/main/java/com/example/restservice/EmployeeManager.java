package com.example.restservice;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class EmployeeManager {
    // Hard coded test data to test API

    private final Employees employees = new Employees();

    @PostConstruct
    public void init(){
        Employees empList = new Employees();

        employees.addEmployee(new Employee(1, "James", "Burge", "james@gmail.com", "Mr"));
        employees.addEmployee(new Employee(2, "Adam", "Smith", "adam@gmail.com", "Mr"));
        employees.addEmployee(new Employee(3, "Sarah", "Wright", "james@gmail.com", "Ms"));
    }

    // Getter for the Employees instance
    public Employees getEmployees() {
        return employees;
    }
}