package test4;

public class BookApp {
	public static void main(String[] args) {
		
		Book.setBookDiscount(10);
		
		//Book book = new Book();  //call default constructor
		
		Book book1 = new Book("C", "R.s. Kanetkar", 280.50);//call parameterized constructor
		Book book2 = new Book("Java", "Balgurusamy", 3000.50);
		
		book1.display();
		book2.display();
	
	}
}
