package kosa.book2;

public class Book {
	String bookName;
	int bookPrice;
	int bookSale;
	
	public Book() {
	}

	public Book(String bookName, int bookPrice) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	// 할인가 구하기
	public void discount() {
		if(bookPrice >= 30000) {
			bookSale = (int)(bookPrice * 0.85);
		} else if(bookPrice >= 20000) {
			bookSale = (int)(bookPrice * 0.8);
		} else if(bookPrice >= 15000) {
			bookSale = (int)(bookPrice * 0.75);
		} else {
			bookSale = bookPrice;
		}
	}
	
	// 책 정보 출력하기
	public void bookInfo() {
		System.out.println("책 이름은 " + bookName + "이며, 책 정가는 " + bookPrice +"원이고, 할인가는 " + bookSale +"원이다." );
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getBookSale() {
		return bookSale;
	}

	public void setBookSale(int bookSale) {
		this.bookSale = bookSale;
	}
	
	

}
