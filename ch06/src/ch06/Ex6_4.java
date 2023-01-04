package ch06;

public class Ex6_4 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		mm.printGugudan(5);
		long ans1 = mm.add(5L, 3L);
		long ans2 = mm.subtract(5L, 3L);
		long ans3 = mm.multiply(5L, 3L);
		double ans4 = mm.divide(5L, 3L);
		long ans5 = mm.max(2, 7);

		System.out.println("add(5L, 3L) = " + ans1); // add메서드 호출
		System.out.println("subtract(5L, 3L) = " + ans2);
		System.out.println("multiply(5L, 3L) = " + ans3);
		System.out.println("divide(5L, 3L) = " + ans4);
		System.out.println(ans5);
	}

}

class MyMath {
	void printGugudan(int dan) {
		// 입력받은 단이 2~9가 아니면, 메서드 종료하고 돌아가기
		if (!(2 <= dan && dan <= 9))
			return;
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		}
	}

	long add(long a, long b) {
		long result = a + b;
		return result;
		// return a+b; -> 위 두 줄을 한 줄로 정리 가능
	}

	// 더 큰 값 반환하는 메서드
	long max(long a, long b) {
		return a > b ? a : b;
	}

	long subtract(long a, long b) {
		return a - b;
	}

	long multiply(long a, long b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
	}
}
