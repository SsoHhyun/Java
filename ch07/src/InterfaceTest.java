class D { // 건드리지 않아도 실행 가능
	// 아까는 F f로 바꿨어야 했다
	public void method(I i) { // 인터페이스 I를 구현한 애들만 들어와라
		i.method();
	}
}

// E 클래스의 선언과 구현의 분리
// method 선언
interface I {
	public void method();
}

// method 구현
class E implements I {
	public void method() {
		System.out.println("E 클래스의 메서드.");
	}
}

class F implements I {
	public void method() {
		System.out.println("F 클래스의 메서드.");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		D d = new D();
		d.method(new E()); // D가 E를 사용 (D가 E에 의존)
		d.method(new F());
	}
}
