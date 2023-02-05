package movie1.me;

public class Member {
	String id;
	String name;
	String email;
	Movie movie;
	
	public Member() {
	}

	public Member(String id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void watch(Movie m) {
		movie = m;
	}
	
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public void showMember() {
		System.out.println("아이디: " + id);
		System.out.println("이름: " + name);
		System.out.println("이메일: " + email);
		movie.showMovie();
	}
	
}
