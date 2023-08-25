package com.example.Aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
//    @Override
    public void getBook(){
        System.out.println("We get book from UniLibrary");
        System.out.println("---------------------------------------");
    }
    public void returnBook(){
        System.out.println("We return book in UniLibrary");
        System.out.println("---------------------------------------");
    }
    public void allMessageUni(){
        System.out.println("allMessageUni: work");
        System.out.println("---------------------------------------");
    }
    public void getMagazine(){
        System.out.println("We return magazine in UniLibrary");
        System.out.println("---------------------------------------");
    }
    public void returnMagazine(){
        System.out.println("We return magazine in UniLibrary");
        System.out.println("---------------------------------------");
    }
    public void addBook(String personName, Book book){
        System.out.println("We add book in UniLibrary name: " + personName + "" +
                " author book: " + book.getAuthor() +
                " name book: " + book.getName() + "" +
                " year publication book: " + book.getYearOfPublication());
        System.out.println("---------------------------------------");
    }
    public void addMagazine(){
        System.out.println("We add magazine in UniLibrary");
        System.out.println("---------------------------------------");
    }


}
