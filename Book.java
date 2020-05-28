package firstAssignment;

import java.util.Scanner;

public class Book {
	public static void main(String arng[]){
		Book b=new Book("Gone with the wind",97890566,"Margaret Mitchell",2000);
		b.display();

}


	String bookName;
	int iSBN;
	String author;
	double price;
	
	public Book(String bookName,int iSBN,String author,double price){
		this.bookName=bookName;
		this.iSBN=iSBN;
		this.author=author;
		this.price=price;
	}
	
	public void display() {
		 System.out.println("Name of the book is:"+bookName);
		 System.out.println("ISBN of the book is :"+iSBN);
		 System.out.println("Author of the book is:"+author);
		 System.out.println("Price of the book is :"+price);


	}
}
	