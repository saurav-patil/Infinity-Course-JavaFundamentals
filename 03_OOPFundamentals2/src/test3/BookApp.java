package test3;

public class BookApp {
	public static void main(String[] args) {
		
		Book.setBookDiscount(10);
		Book book1 = new Book("C", "R.s. Kanetkar", 280.50);
		Book book2 = new Book("Java", "Balgurusamy", 3000.50);
		
		book1.display();
		book2.display();
	
		Book.setBookDiscount(15);	
		book1.display();
		book2.display();
	}
}
