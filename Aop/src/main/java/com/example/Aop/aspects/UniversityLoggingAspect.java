package com.example.Aop.aspects;

import com.example.Aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: Logging list students \n"
//       + "Before method getStudents");
//    }
//    @AfterReturning(pointcut = "execution(* getStudents())",
//            returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//
//        Collections.sort(students);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: Logging list students \n"
//                + "After method getStudents");
//    }
//    @AfterThrowing(pointcut = "execution(* getStudents())",
//                    throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: Logging exception - " +
//                exception);
//    }

    @After("execution(* *Students())")
    public void afterGetAndAddStudentAdvice(){
        System.out.println("afterGetAndAddStudentAdvice: Logging");
    }
}

