package com.example.spring.boot.data_jpa.service;


import com.example.spring.boot.data_jpa.dao.EmployeeRepo;
import com.example.spring.boot.data_jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    @Transactional
    public Employee getEmployeeBuId(Integer id) {
        Employee employee = null;
        Optional<Employee> employeeOpt = employeeRepo.findById(id);
        if (employeeOpt.isPresent()){
            employee = employeeOpt.get();
        }
        return employee;
    }
    @Override
    @Transactional
    public void deleteEmployee(Integer id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public List<Employee> getByName(String name) {
       return employeeRepo.findAllByName(name);
    }
}
