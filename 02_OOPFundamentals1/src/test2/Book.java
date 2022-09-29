package test2;

public class Book {
	private String bookName;
	private String bookAuthor;
	private double bookPrice;

public void getData(String name, String author, double price)
{
	bookName = name;
	bookAuthor = author;
	bookPrice = price;
}
	public void display()
	{
		System.out.println("Book Name - "+ bookName);
		System.out.println("Book Author - "+ bookAuthor);
		System.out.println("Book Price - "+ bookPrice);
		System.out.println("-------------------------------------------------------------");
	}
	
	

}
