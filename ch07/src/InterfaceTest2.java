class A {
	// C를 사용하려면 C b로 바꿔야 함
	public void method(B b) {
		b.method();
	}
}

class B {
	public void method() {
		System.out.println("B 클래스의 메서드.");
	}
}

class C {
	public void method() {
		System.out.println("C 클래스의 메서드.");
	}
}

public class InterfaceTest2 {
	public static void main(String[] args) {
		A a = new A();
		// a.method(new C()); 로 바꿔야 C 사용 가능
		a.method(new B()); // A가 B를 사용 (A가 B에 의존)

	}

}
