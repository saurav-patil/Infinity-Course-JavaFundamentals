package test3;

public class Book {
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	private static double bookDiscount; //<--Class variable
	
	//Default Constructor
//	private Book()
//	{
//		System.out.println("Constructor Called\n");
//	}
	
	//Paramterize Constructor
	public Book(String name, String author, double price)
	{
		bookName = name;
		bookAuthor = author;
		bookPrice = price;
	}
	
	public static void setBookDiscount(double discount)
	{
		bookDiscount = discount;
	}
	
	private double calculateDiscountedPrice()
	{
		double price = bookPrice - ((bookDiscount/100)*bookPrice);
		return price;
	}
	/*
	public void getData(String name, String author, double price)
	{
		bookName = name;
		bookAuthor = author;
		bookPrice = price;
	}
	*/
	public void display()
	{
		System.out.println("Book Name - "+ bookName);
		System.out.println("Book Author - "+ bookAuthor);
		System.out.println("Book Price - "+ bookPrice);
		System.out.println("Book Discount - " + bookDiscount);
		System.out.println("Book Discounted Price - "  +calculateDiscountedPrice());
		System.out.println("-------------------------------------------------------------");
	
	}
	
}
