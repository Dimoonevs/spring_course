package com.sprind.boot.controller;


import com.sprind.boot.entity.Employee;
import com.sprind.boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {
    @Autowired
    public EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("/employees/{id}")
    public Employee showEmployeeById(@PathVariable Integer id){
        Employee employee = employeeService.getEmployeeBuId(id);
        return employee;
    }
    @PostMapping("/employees")
    public Employee  addNewEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    }
    @PutMapping("/employees")
    public Employee changeEmployee(@RequestHeader Integer id, @RequestBody Employee employee){
        employee.setId(id);
        employeeService.saveEmployee(employee);
        return employee;
    }
    @DeleteMapping("/employees/{id}")
    public Employee deleteEmployee(@PathVariable Integer id){
        Employee employee = employeeService.getEmployeeBuId(id);
        employeeService.deleteEmployee(id);
        return employee;
    }

}
