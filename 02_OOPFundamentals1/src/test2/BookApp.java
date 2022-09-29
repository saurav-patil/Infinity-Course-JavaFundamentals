package test2;

public class BookApp {
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();
		
		/*
		book1.bookName = "C";
		book1.bookAuthor = "R.s.Kanetkar";
		book1.bookPrice = 280.50;
		*/
		
		book1.getData("C", "R.s. Kanetkar", 280.50);
		book2.getData("Java", "Balgurusamy", 3000);
		
		book1.display();
		book2.display();
	}
}
