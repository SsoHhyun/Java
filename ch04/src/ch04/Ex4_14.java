package ch04;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		num = Integer.parseInt(str);
		
		while(num != 0) {
			// num을 10으로 나눈 나머지를 sum에 더함
			sum += num % 10;
			System.out.printf("sum = %3d num = %d%n", sum, num);
			num /= 10;
		}
		System.out.println("각 자리수의 합: " + sum);
	}

}
