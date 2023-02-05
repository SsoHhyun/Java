package movie1.me;

public class Movie {
	private int no;
	private String title;
	private String actor;
	
	public Movie() {
	}

	public Movie(int no, String title, String actor) {
		this.no = no;
		this.title = title;
		this.actor = actor;
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

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
	public void showMovie() {
		System.out.println("영화 번호: " + no);
		System.out.println("영화 제목: " + title);
		System.out.println("영화 배우: " + actor);
	}
	
	
}
