package ch04;

import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		int num = 0, ans = 0;
		ans = (int) (Math.random() * 100) + 1; // 1과 100 사이의 숫자
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("1과 100 사이의 숫자를 입력하세요 : ");
			num = sc.nextInt();

			if (num > ans) {
				System.out.println("더 작은 숫자로 도전해 보세요.");
			} else if (num < ans) {
				System.out.println("더 큰 숫자로 도전해 보세요.");
			}
		} while (num != ans);
		System.out.println("정답입니다.");
	}

}
