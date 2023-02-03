package kosa.book;

public class BookMain {

	public static void main(String[] args) {
		int total = 0;
		Book[] bookList = {
			new Book("JAVA", 30000),
			new Book("JSP", 20000),
			new Book("DB", 15000)
		};
		
		for(Book b: bookList) {
			b.totalPrice();
			b.bookInfo();
			total += b.getSalePrice();
		}
		
		System.out.println("총 가격은 " + total +"원입니다.");
		}

	}

