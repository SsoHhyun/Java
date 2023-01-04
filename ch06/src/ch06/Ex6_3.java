package ch06;

public class Ex6_3 {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.num = 7;

		Card c2 = new Card();
		c2.kind = "Diamond";
		c2.num = 5;

		System.out.println("c1은 " + c1.kind + ", " + c1.num + "이며, 크기는 " + c1.width + ", 높이는 " + c1.height + "이다.");
		System.out.println("c2은 " + c2.kind + ", " + c2.num + "이며, 크기는 " + c2.width + ", 높이는 " + c2.height + "이다.");
		
		System.out.println("c1의 크기와 높이를 50, 80으로 변경했습니다.");
		// c1.width = 50; // iv가 아닌 cv
		// c1.height = 80; // iv가 아닌 cv
		// 오해하지 않게 클래스 이름으로 쓰기
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.num + "이며, 크기는 " + c1.width + ", 높이는 " + c1.height + "이다.");
		System.out.println("c2은 " + c2.kind + ", " + c2.num + "이며, 크기는 " + c2.width + ", 높이는 " + c2.height + "이다.");

	}

}

class Card {
	String kind;
	int num;
	static int width = 100;
	static int height = 250;
}
