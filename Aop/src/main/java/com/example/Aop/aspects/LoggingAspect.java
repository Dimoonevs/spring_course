package com.example.Aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
//    @Pointcut("execution(* com.example.Aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//    @Pointcut("execution(public void com.example.Aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodLoggingAdvice(){
//        System.out.println("beforeAllMethodLoggingAdvice: writing Log #10");
//    }

//    @Pointcut("execution(* com.example.Aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//    @Pointcut("execution(* com.example.Aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndMethodsFromUniLibrary(){}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }


    @Before("com.example.Aop.aspects.MyPointcuts.allGetMethod()") //(*) любой один параметр (..) любое количестов параметров
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: Log of trying get book or magazine");
    }




}
