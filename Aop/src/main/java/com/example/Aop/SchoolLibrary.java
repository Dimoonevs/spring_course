package com.example.Aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{
//    @Override
    public void getBook() {
        System.out.println("We get book from school library");
    }
    public void allMessageSchool(){
        System.out.println("allMessageSchool: work");
    }
    public String allMessageReturnTypeStringSchool(){
        System.out.println("allMessageReturnTypeStringSchool: work");
        return "";
    }


}
