package book.me;

public class Book {
	private int no;
	private String title;
	private String writer;
	
	public Book() {
	}

	public Book(int no, String title, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
	}
	
	public void show() {
		System.out.println("책 번호: " + no);
		System.out.println("제목: " + title);
		System.out.println("작가: " + writer);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	
}
