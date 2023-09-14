package com.sprind.boot.service;


import com.sprind.boot.dao.EmployeeDAO;
import com.sprind.boot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDAO employeeDAO;
    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployeeBuId(Integer id) {
        return employeeDAO.getEmployeeBuId(id);
    }


    @Override
    @Transactional
    public void deleteEmployee(Integer id) {
        employeeDAO.deleteEmployeeById(id);
    }
}
