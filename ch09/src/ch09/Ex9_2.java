package ch09;

class Person {
	long id; // this.id
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Person))
			return false;
		// Person 객체와 같은 종류일 때만 비교
		// Person p = (Person) obj;
		// return this.id == p.id;
		// 위 두 문장을 하나로 쓴 것
		return id == ((Person)obj).id;
//		else
//			return false;
	}

	public Person(long id) {
		this.id = id;
	}
	
}

public class Ex9_2 {
	public static void main(String[] args) {
		Person p1 = new Person(3123434934342323L);
		Person p2 = new Person(3123434934342323L);
		
		if(p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 같은 사람이 아닙니다.");
	}

}
