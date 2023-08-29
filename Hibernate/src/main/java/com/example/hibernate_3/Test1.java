package com.example.hibernate_3;

import com.example.hibernate_3.entity.Department;
import com.example.hibernate_3.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class)
                        .addAnnotatedClass(Department.class)
                        .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

//            Department department = new Department("IT", 300, 2000);
//            Employee employee = new Employee("Dima", "Yevsiukov", 1000);
//            Employee employee2 = new Employee("Elena", "Smirnova", 800);
//
//            department.addEmployeeToDepartment(employee);
//            department.addEmployeeToDepartment(employee2);

//            session.save(department);

//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmployees());

            Employee employee = session.get(Employee.class, 2);
            System.out.println(employee);
            System.out.println(employee.getDepartment());

            session.delete(employee);
            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
    }
}
