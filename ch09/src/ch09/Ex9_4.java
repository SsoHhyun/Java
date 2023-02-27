package ch09;

import java.util.Objects;

class Card2 {
	String kind;
	int number;
	
	Card2() {
		this("SPADE", 1);
	}

	Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kind == null) ? 0 : kind.hashCode());
		result = prime * result + number;
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Card2))
			return false;
		Card2 other = (Card2) obj;
		if (kind == null) {
			if (other.kind != null)
				return false;
		} else if (!kind.equals(other.kind))
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	
	
	
	// object 클래스의 toString() 오버라이딩
	public String toString() {
		return "kind: " + kind + ", number: " + number;
	}
}

public class Ex9_4 {

	public static void main(String[] args) {
		Card2 c1 = new Card2();
		Card2 c2 = new Card2();
		
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
