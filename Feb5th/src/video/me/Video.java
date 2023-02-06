package video.me;

public class Video {
	private int no;
	private String title;
	private String actor;
	
	public Video() {
	}

	public Video(int no, String title, String actor) {
		super();
		this.no = no;
		this.title = title;
		this.actor = actor;
	}

	public void showVideo() {
		System.out.println("번호: " + no);
		System.out.println("제목: " + title);
		System.out.println("배우: " + actor);
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

	

}
