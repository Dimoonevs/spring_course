package com.example.hibernate_5;

import com.example.hibernate_5.entity.Department;
import com.example.hibernate_5.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Department.class)
                        .addAnnotatedClass(Employee.class)
                        .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

//            Department department = new Department("IT", 300, 2000);
//            Employee employee = new Employee("Dima", "Yevsiukov", 1000);
//            Employee employee2 = new Employee("Elena", "Smirnova", 800);
//            Employee employee3 = new Employee("Maria", "Slovo", 950);
//
//            department.addEmployeeToDepartment(employee);
//            department.addEmployeeToDepartment(employee2);
//            department.addEmployeeToDepartment(employee3);

//            session.save(department);

            System.out.println("Get Department");
            Department department = session.get(Department.class, 3);

            System.out.println("Show department");
            System.out.println(department);
            System.out.println("Show Employees of department");
            System.out.println(department.getEmployees());

            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
    }
}
