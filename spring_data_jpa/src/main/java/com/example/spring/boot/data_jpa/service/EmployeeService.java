package com.example.spring.boot.data_jpa.service;



import com.example.spring.boot.data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployeeBuId(Integer id);
    public void deleteEmployee(Integer id);
    List<Employee> getByName(String name);
}
