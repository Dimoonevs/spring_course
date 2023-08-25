package com.example.Aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    @Pointcut("execution(* get*())")
    private void allGetMethod(){}

    @Before("allGetMethod()") //(*) любой один параметр (..) любое количестов параметров
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: we try get book or magazine");
    }

    @Before("allGetMethod()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: check rules for get books or magazine");
    }



}
