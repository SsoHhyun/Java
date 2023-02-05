package movie1.me;

public class movieMain {

	public static void main(String[] args) {
		Movie movie = new Movie(1, "헤어질 결심", "탕웨이");
		Member member = new Member("abcd", "김민주", "@com");
		
		member.watch(movie);
		member.showMember();
	}

}
