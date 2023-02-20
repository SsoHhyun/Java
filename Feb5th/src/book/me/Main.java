package book.me;

public class Main {
	public static void main(String[] args) {
		Book b = new Book(1, "폭풍의 언덕", "에밀리 ..");
		Member m = new Member("id", "name", 23);
//		m.rental(b);
//		m.show();
//		
		Member[] arr = { new Member("아이디", "장원영", 20), new Member("id", "사쿠라", 25) };
		for(int i = 0; i < arr.length; i++) {
			arr[i].rental(b);
			arr[i].show();
		}
	}

}
