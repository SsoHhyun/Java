package book.me;

public class Member {
	private String id;
	private String name;
	private int age;
	private Book rentalBook;
	
	public Member() {
	}

	public Member(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public void rental(Book b) {
		rentalBook = b;
	}
	
	public void show() {
		System.out.println("아이디: " + id);
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		rentalBook.show();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Book getRentalBook() {
		return rentalBook;
	}

	public void setRentalBook(Book rentalBook) {
		this.rentalBook = rentalBook;
	}
	
	
	
	
	

}
