package com.example.spring.rest.service;

import com.example.spring.rest.dao.EmployeeDAO;
import com.example.spring.rest.entity.Employee;
import com.example.spring.rest.exception_handling.EmployeeIncorrectData;
import com.example.spring.rest.exception_handling.NoSuchEmployeeException;
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
