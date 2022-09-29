package test4;

public class Book {
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	private static double bookDiscount; //<--Class variable
	
	//Default Constructor
	public Book()
	{
		System.out.println("Constructor Called\n");
	}
	
	//Parameterized constructor
	public Book(String bookName, String bookAuthor, double bookPrice)
	{
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}
	
	public static void setBookDiscount(double bookDiscount)
	{
		Book.bookDiscount = bookDiscount;
	}
	private double calculateDiscountedPrice()
	{
		double bookPrice = 0.0;
		double price = this.bookPrice - ((bookDiscount/100)*bookPrice);
		return price;
	}
	public void display()
	{
		System.out.println("Book Name - "+ this.bookName);
		System.out.println("Book Author - "+ this.bookAuthor);
		System.out.println("Book Price - "+ this.bookPrice);
		System.out.println("Book Discount - " + Book.bookDiscount);
		System.out.println("Book Discounted Price - "  +this.calculateDiscountedPrice());
		System.out.println("-------------------------------------------------------------");
	
	}
	
}
