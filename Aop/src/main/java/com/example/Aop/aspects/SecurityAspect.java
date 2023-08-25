package com.example.Aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("com.example.Aop.aspects.MyPointcuts.allGetMethod()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: check rules for get books or magazine");
    }
}
