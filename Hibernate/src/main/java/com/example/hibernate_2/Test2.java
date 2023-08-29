package com.example.hibernate_2;

import com.example.hibernate_2.entity.Detail;
import com.example.hibernate_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class)
                        .addAnnotatedClass(Detail.class)
                        .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee employee =
//                    new Employee("Misha", "Yevsiukov", "IT", 800);
//            Detail detail =
//                    new Detail("London", "2589634", "someMail4@gmail.com");
//
//            employee.setDetail(detail);
//            detail.setEmployee(employee);
//
//            session.save(detail);

            Detail detail = session.get(Detail.class,3);
//            Employee employee = detail.getEmployee();
//            System.out.println(employee);
            detail.getEmployee().setDetail(null);
            session.delete(detail);

            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
    }
}
