package com.example.Aop.aspects;

import com.example.Aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
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


    @Before("com.example.Aop.aspects.MyPointcuts.allAddMethod()") //(*) любой один параметр (..) любое количестов параметров
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method signature = "+signature);
        System.out.println("Get method = "+signature.getMethod());
        System.out.println("Get return type = "+signature.getReturnType());
        System.out.println("Get name = "+signature.getName());
        if (signature.getName().equals("addBook")){
            Object[] objects = joinPoint.getArgs();
            for (Object obj: objects){
                if (obj instanceof Book){
                    Book book = (Book) obj;
                    System.out.println(book);
                }else if (obj instanceof String){
                    String name = (String) obj;
                    System.out.println(name);
                }
            }
        }

        System.out.println("beforeAddLoggingAdvice: Log of trying get book or magazine");
        System.out.println("---------------------------------------");
    }




}
