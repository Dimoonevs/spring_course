package com.example.hibernate_6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration().configure("hibernate.cfg.xml")
                        .buildSessionFactory();


        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }


    }
}
