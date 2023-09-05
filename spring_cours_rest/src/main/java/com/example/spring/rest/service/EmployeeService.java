package com.example.spring.rest.service;

import com.example.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployeeBuId(Integer id);
    public void deleteEmployee(Integer id);
}
