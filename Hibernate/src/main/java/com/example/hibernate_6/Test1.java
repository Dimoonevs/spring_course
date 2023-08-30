package com.example.hibernate_6;

import com.example.hibernate_6.entity.Child;
import com.example.hibernate_6.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Child.class)
                        .addAnnotatedClass(Section.class)
                        .buildSessionFactory();


        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
//            Section section1 = new Section("MMA");
//            Section section2 = new Section("Football");
//            Child child1 = new Child("Dima", 17);
//            Child child2 = new Child("Ivan", 13);
//            Child child3 = new Child("Stanislav", 17);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child3);
//            section2.addChildToSection(child2);
//            section2.addChildToSection(child3);
//
//            session.save(section1);
//            session.save(section2);

//            ***************************************

//            Section sectionChess = new Section("Chess");
//            Section sectionMMA = session.get(Section.class, 1);
//            Section sectionFootball = session.get(Section.class, 2);
//            Child child = new Child("Igor", 7);
//            Child child1 = new Child("Masha", 12);
//            Child child2 = new Child("Anton", 8);
//            sectionChess.addChildToSection(child);
//            sectionChess.addChildToSection(child1);
//            sectionChess.addChildToSection(child2);
//            sectionMMA.addChildToSection(child2);
//            sectionFootball.addChildToSection(child);
//
//            session.save(sectionChess);
//            session.save(sectionMMA);
//            session.save(sectionFootball);

//            ***************************************

//            Section section = session.get(Section.class, 1);
//
//            System.out.println(section);
//            System.out.println(section.getChildren());

//            ***************************************

//            Child child = session.get(Child.class, 4);
//
//            System.out.println(child);
//            System.out.println(child.getSections());

//            ***************************************

//            Section section = session.get(Section.class, 2);
//
//            session.delete(section);

//            *************************************** After removing the CascadeType.REMOVE (CascadeType.ALL)

//            Section sectionMMA = new Section("MMA");
//            Section sectionFootball = new Section("Football");
//            Section sectionChess = new Section("Chess");
//            Section sectionMath = new Section("Math");
//
//            Child child1 = new Child("Dima", 17);
//            Child child2 = new Child("Igor", 8);
//            Child child3 = new Child("Ivan", 9);
//            Child child4 = new Child("Stanislav", 16);
//            Child child5 = new Child("Danil", 16);
//            Child child6 = new Child("Maria", 17);
//
//            sectionMMA.addChildToSection(child1);
//            sectionMMA.addChildToSection(child4);
//            sectionMMA.addChildToSection(child5);
//
//            sectionMath.addChildToSection(child1);
//            sectionMath.addChildToSection(child6);
//            sectionMath.addChildToSection(child3);
//            sectionMath.addChildToSection(child4);
//
//            sectionChess.addChildToSection(child1);
//            sectionChess.addChildToSection(child2);
//            sectionChess.addChildToSection(child4);
//            sectionChess.addChildToSection(child6);
//
//            sectionFootball.addChildToSection(child2);
//            sectionFootball.addChildToSection(child3);
//
//            session.persist(sectionMMA);
//            session.persist(sectionChess);
//            session.persist(sectionMath);
//            session.persist(sectionFootball);

//            ***************************************

//            Section section = session.get(Section.class, 4);
//
//            session.delete(section);

//            ***************************************

            Child child = session.get(Child.class, 5);

            session.delete(child);


            session.getTransaction().commit();
            System.out.println("DONE!!!");
        }
        finally {
            session.close();
            factory.close();
        }


    }
}
