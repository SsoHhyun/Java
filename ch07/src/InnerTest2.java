class AAA { // AAA는 BBB의 외부 클래스
	int i = 100;
	BBB b = new BBB();
	
	class BBB { // BBB는 AAA의 내부 클래스
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);
			// 객체 생성 없이 외부 클래스 멤버 접근 가능
			System.out.println(i);
		}
	}
}

// class CCC에서는 BBB를 사용할 수 없다

public class InnerTest2 {
	public static void main(String[] args) {
//		BBB b = new BBB();
//		b.method();

	}
}