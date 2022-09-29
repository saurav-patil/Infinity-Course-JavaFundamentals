package test1;

public class Book {
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	
	public void display()
	{
		System.out.println("Book Name - "+ bookName);
		System.out.println("Book Author - "+ bookAuthor);
		System.out.println("Book Price - "+ bookPrice);
		System.out.println("-------------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.bookName = "C";
		book1.bookAuthor = "R.s.Kanetkar";
		book1.bookPrice = 280.50;
		
		book1.display();
		book2.display();
	}

}
