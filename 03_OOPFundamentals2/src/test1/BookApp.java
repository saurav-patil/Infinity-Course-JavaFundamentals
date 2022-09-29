package test1;

public class BookApp {
	public static void main(String[] args) {
		
		Book.setBookDiscount(10);
		Book book1 = new Book();
		Book book2 = new Book();
		
	
		book1.getData("C", "R.s. Kanetkar", 280.50);
		book2.getData("Java", "Balgurusamy", 3000.50);
		
		book1.display();
		book2.display();
	
		Book.setBookDiscount(15);
		book1.display();
		book2.display();
	}
}
