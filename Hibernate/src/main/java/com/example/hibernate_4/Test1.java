package com.example.hibernate_4;

import com.example.hibernate_4.entity.Department;
import com.example.hibernate_4.entity.Employee;
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

//            Department department = new Department("HR", 1500, 500);
//
//            Employee employee1 = new Employee("Oleg", "Ivanov", 800);
//            Employee employee2 = new Employee("Andrei", "Sidorov", 600);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            session.save(department);


//            Department department = session.get(Department.class, 2);
//            System.out.println(department);
//            System.out.println(department.getEmployees());


//            Employee employee = session.get(Employee.class, 3);
//            System.out.println(employee);

//            Employee employee = session.get(Employee.class, 3);
//            session.delete(employee);

            Department department = session.get(Department.class, 2);
            session.delete(department);


            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
    }
}
