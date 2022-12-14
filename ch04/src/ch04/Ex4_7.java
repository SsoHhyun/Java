package ch04;

public class Ex4_7 {

	public static void main(String[] args) {
		// 1~10 사이의 난수 20개 출력
		for (int i = 1; i <= 20; i++) {
//			System.out.println(Math.random()); // 0.0 <= x < 1.0
//			System.out.println(Math.random() * 10); // 0.0 <= x < 10.0
//			System.out.println((int) (Math.random() * 10)); // 0 <= x < 10
			System.out.println((int) (Math.random() * 10) + 1); // 1 <= x < 11
			// -5 ~ 5 하려면 11 곱해 준 다음에 5 빼기
		}
	}

}
