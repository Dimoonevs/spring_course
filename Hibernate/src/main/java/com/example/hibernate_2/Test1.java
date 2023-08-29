package com.example.hibernate_2;

import com.example.hibernate_2.entity.Detail;
import com.example.hibernate_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session =
                    factory.getCurrentSession();
            session.beginTransaction();

//            Employee employee = new Employee("Dima", "Yevsiukov","IT",1500);
//            Detail detail = new Detail("Dnipro", "124134", "someMail@mail.com");
//            employee.setDetail(detail);

//            Employee employee = new Employee("Oleg", "Solovei","Sails",700);
//            Detail detail = new Detail("Kharkov", "1241343144", "someMail2@mail.com");
//            employee.setDetail(detail);

//            session.save(employee);

//            Employee employee = session.get(Employee.class, 2);
//            System.out.println(employee.getDetail());

            Employee employee = session.get(Employee.class, 3);
            session.delete(employee);



            System.out.println("Done");
        }finally {
            session.close();
            factory.close();
        }
    }
}
