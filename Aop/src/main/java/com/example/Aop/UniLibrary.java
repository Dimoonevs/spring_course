package com.example.Aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
//    @Override
    public void getBook(){
        System.out.println("We get book from UniLibrary");
    }
    public void returnBook(){
        System.out.println("We return book in UniLibrary");
    }
    public void allMessageUni(){
        System.out.println("allMessageUni: work");
    }
    public void getMagazine(){
        System.out.println("We return magazine in UniLibrary");
    }
    public void returnMagazine(){
        System.out.println("We return magazine in UniLibrary");
    }
    public void addBook(){
        System.out.println("We add book in UniLibrary");
    }
    public void addMagazine(){
        System.out.println("We add magazine in UniLibrary");
    }


}
