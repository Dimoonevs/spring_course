package com.sprind.boot.dao;

import com.sprind.boot.entity.Employee;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Employee> getAllEmployees() {
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("from Employee", Employee.class);
        List<Employee> allEmployees = query.getResultList();
        return allEmployees;
    }

//    @Override
//    public void saveEmployee(Employee employee) {
//        Session session = sessionFactory.getCurrentSession();
//
//        session.saveOrUpdate(employee);
//    }
//
//    @Override
//    public Employee getEmployeeBuId(Integer id) {
//        Session session = sessionFactory.getCurrentSession();
//        return session.get(Employee.class, id);
//    }
//
//    @Override
//    public void deleteEmployeeById(Integer id) {
//        Session session = sessionFactory.getCurrentSession();
//        Employee employee = session.get(Employee.class, id);
//
//        session.delete(employee);
//    }

}
