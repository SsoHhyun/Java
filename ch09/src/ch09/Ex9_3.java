package ch09;

import java.util.Objects;

class Card {
	String kind;
	int num;

	Card() {
		this("SPADE", 1);
	}

	public Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}

	// Object 클래스의 toString() 오버라이딩
	public String toString() {
		return "kind=" + kind + ", num=" + num;
	}
	
	// equals()를 오버라이딩하면 hashCode()도 오버라이딩해야 함
		// Objects 클래스: 객체와 관련된 유용한 메서드를 제공하는 유틸 클래스
		// hash: 매개변수가 가변 인자(Object)여서 호출 시 지정하는 값의 개수가 정해져 있지 않음
	
	// hash라고 쓰면 오류 나서 그냥 인자 하나만 받아서 hashcode로 씀
	public int hashCode() {
		return Objects.hashCode(kind);
	}
	
	// equals 오버라이딩
	public boolean equals(Object obj) {
		if (!(obj instanceof Card))
			return false;

		Card c = (Card) obj;
		return this.kind.equals(c.kind) && this.num == c.num;
	}
}

public class Ex9_3 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();

		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
