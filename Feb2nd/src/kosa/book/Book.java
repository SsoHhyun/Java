package kosa.book;

public class Book {
	private String name;
	private int price;
	private int salePrice;

	// 기본 생성자
	public Book() {
	}
	
	// 초기화
	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	// 할인가 구하기
	public void totalPrice() {
		if (price >= 30000) {
			salePrice = (int) (price * 0.85);
		} else if (20000 <= price && price < 30000) {
			salePrice = (int) (price * 0.8);
		} else if (15000 <= price && price < 20000)
			salePrice = (int) (price * 0.75);
	}
	
	// 책 정보 출력
	public void bookInfo() {
		System.out.println("책 이름: " + name);
		System.out.println("책 가격: " + price);
		System.out.println("할인 가격: " + salePrice);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	
}
