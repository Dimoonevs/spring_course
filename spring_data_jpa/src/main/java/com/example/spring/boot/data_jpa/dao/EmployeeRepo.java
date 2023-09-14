package com.example.spring.boot.data_jpa.dao;

import com.example.spring.boot.data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    List<Employee> findAllByName(String name);
}
