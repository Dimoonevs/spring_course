package com.example.Aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
//    @Override
    public void getBook(){
        System.out.println("We get book from universaty library: ");
    }
    public void allMessageUni(){
        System.out.println("allMessageUni: work");
    }
    public void getMagazine(){
        System.out.println("Get magazine: work");
    }
}
