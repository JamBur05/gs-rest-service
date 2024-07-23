package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList = new ArrayList<>();

    // Getters and Setters
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    // Method to add an employee
    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    // Method to remove an employee
    public void removeEmployee(Employee employee) {
        this.employeeList.remove(employee);
    }
}
