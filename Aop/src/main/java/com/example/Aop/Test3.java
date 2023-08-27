package com.example.Aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Main Starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);

        String bookName = uniLibrary.returnBook();
        System.out.println("Return book - " + bookName);
        context.close();
        System.out.println("Main Ends");
    }
}
