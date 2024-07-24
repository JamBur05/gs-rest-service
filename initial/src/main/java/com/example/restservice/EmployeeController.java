package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeManager employeeManager;

    // Inject EmployeeManager via constructor
    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    // Handle GET request to /employees
    @GetMapping
    public List<Employee> getEmployees() {
        // Return the list of employees from the EmployeeManager
        return employeeManager.getEmployees().getEmployeeList();
    }

    // Handle POST request to /employees
    @PostMapping
    public String createEmployee(@RequestBody Employee employee) {

        employeeManager.getEmployees().addEmployee(employee);

        return "Employee added!";
    }
}