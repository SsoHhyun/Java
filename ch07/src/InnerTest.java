class AA {
	int i = 100;
	BB b = new BB();
}

class BB {
	void method() {
		// 객체를 만들어야 한다
		AA a = new AA();
		System.out.println(a.i);
	}
}

class CC {
	CC c = new CC();
}

public class InnerTest {
	public static void main(String[] args) {
		BB b = new BB();
		b.method();
	}
}