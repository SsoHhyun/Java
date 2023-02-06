package video.me;

public class Member {
	private String id;
	private String name;
	private int age;
	private Video rentalVideo;
	
	public Member() {
	}

	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Video getRentalVideo() {
		return rentalVideo;
	}

	public void setRentalVideo(Video rentalVideo) {
		this.rentalVideo = rentalVideo;
	}

	public void show() {
		System.out.println("아이디: " +id);
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	
	public void rental (Video video) {
		rentalVideo = video;
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
}
