package com.example.Aop;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(MyConfig.class);

		UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
		Book book = context.getBean("book", Book.class);
//		uniLibrary.getBook();
//		System.out.println();
//		uniLibrary.getMagazine();
		uniLibrary.addBook(book.getAuthor(), book);
		uniLibrary.addMagazine();

//		System.out.println();
//		uniLibrary.returnBook();
//		uniLibrary.returnMagazine();
//		System.out.println();
//		uniLibrary.addBook();

//		SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//		schoolLibrary.getBook();
//		schoolLibrary.allMessageSchool();
//		schoolLibrary.allMessageReturnTypeStringSchool();

		context.close();
	}

}
