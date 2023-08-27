package com.example.Aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(String returnBook())")
    public Object aroundReturnBookAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookAdvice: Logging Start");
        Object targetMethodResult = null;
        try {

            targetMethodResult = proceedingJoinPoint.proceed();
        }catch (Exception e){
            System.out.println("aroundReturnBookAdvice: we catch exception: " + e);
//            targetMethodResult = "Unknown name books";
            throw e;
        }
//        targetMethodResult = "New books";
        System.out.println("aroundReturnBookAdvice: Logging End");
        return targetMethodResult;
    }

}
