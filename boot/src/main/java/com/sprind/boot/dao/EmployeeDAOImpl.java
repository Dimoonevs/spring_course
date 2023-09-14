package com.sprind.boot.dao;

import com.sprind.boot.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Employee> getAllEmployees() {
//        Session session = entityManager.unwrap(Session.class);
//        Query query = session.createQuery("from Employee", Employee.class);
//        List<Employee> allEmployees = query.getResultList();
        Query query = entityManager.createQuery("from Employee ");
        List<Employee> employees = query.getResultList();
        return employees;
    }

    @Override
    public void saveEmployee(Employee employee) {
//        Session session = entityManager.unwrap(Session.class);
//
//        session.saveOrUpdate(employee);
        Employee newEmployee =entityManager.merge(employee);
        employee.setId(newEmployee.getId());
    }

    @Override
    public Employee getEmployeeBuId(Integer id) {
//        Session session = entityManager.unwrap(Session.class);
//        return session.get(Employee.class, id);
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public void deleteEmployeeById(Integer id) {
//        Session session = entityManager.unwrap(Session.class);
//        Employee employee = session.get(Employee.class, id);
//
//        session.delete(employee);
        Query query = entityManager.createQuery("delete from Employee " +
                "where id =:employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }

}
