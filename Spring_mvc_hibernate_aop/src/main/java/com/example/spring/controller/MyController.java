package com.example.spring.controller;

import com.example.spring.entity.Employee;
import com.example.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/api/v1")
public class MyController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model){
       List<Employee> allEmployees = employeeService.getAllEmployees();
       model.addAttribute("allEmployees", allEmployees);
        return "index";
    }
    @RequestMapping("/add")
    public String addNewEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-info";
    }
    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee")Employee employee ){
        employeeService.saveEmployee(employee);
        return "redirect:/api/v1/";
    }
    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("empId") Integer id, Model model){
        Employee employee = employeeService.getEmployeeBuId(id);
        model.addAttribute("employee", employee);
        return "employee-info";
    }
    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId")Integer id){
        employeeService.deleteEmployee(id);
        return "redirect:/api/v1/";
    }
}
