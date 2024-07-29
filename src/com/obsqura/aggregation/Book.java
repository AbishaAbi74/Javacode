package com.obsqura.aggregation;

public class Book {
	String bookName;
	int price;
	Author author;
	

	public Book(String bookName, int price, Author author) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}
    public void print() // method to print book details
    {
    	System.out.println(bookName+ " " +price);
    	System.out.println(author.authorName+" "+author.age +" "+author.place);
	
}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Author a = new Author("Willliam Shakespear",90,"England");
		Book b = new Book("Julis Caesar",500,a);
		b.print();

	}

}
