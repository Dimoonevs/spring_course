package com.example.spring.rest.dao;

import com.example.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployeeBuId(Integer id);
    public void deleteEmployeeById(Integer id);
}
