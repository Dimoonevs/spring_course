package com.example.spring.service;

import com.example.spring.dao.EmployeeDAO;
import com.example.spring.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
