package com.cg.labbook.lab2.client;
import com.cg.labbook.lab2.model.Book;
public class Lab2LibraryClient  {

	public static void main(String[] args) {
		
		Book bookob1 = new Book(101,"Book101",3,"p.k.saha");
		Book bookob2 = new Book(101,"Book102",3,"p.k.saha");
		bookob1.print();
		System.out.println("...................................................");
		System.out.println(bookob1.toString());
		System.out.println("...................................................");
		System.out.println(bookob1);
		System.out.println("...................................................");
		System.out.println(bookob1.equals(bookob2));
	}

}
