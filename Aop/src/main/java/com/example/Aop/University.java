package com.example.Aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Dima Yevsiukov", 5, 9.3);
        Student st2 = new Student("Aim Lost", 3, 5.2);
        Student st3 = new Student("Elena Ostapova", 4, 8.1);

        students.add(st1);
        students.add(st2);
        students.add(st3);
        System.out.println("Add new students");
    }
    public List<Student> getStudents(){
        System.out.println("START POINT");
//        System.out.println(students.get(3));
        System.out.println("Info from method getStudents");
        System.out.println(students);
        return students;
    }

}
