package kosa.book2;

public class BookMain {
	public static void main(String[] args) {
		int totalPrice = 0;
		Book[] bookList = { new Book("Java", 30000), new Book("Jsp", 25000), new Book("DB", 15000) };
		
		for(Book b: bookList) {
			b.discount();
			b.bookInfo();
			totalPrice += b.getBookSale();
		}
		System.out.println("총 가격은 " + totalPrice +"원입니다.");
	}

}
