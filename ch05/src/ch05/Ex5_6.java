package ch05;

import java.util.Arrays;

public class Ex5_6 {

	public static void main(String[] args) {
		// 가위바위보
		String[] str = { "가위", "바위", "보" };
		System.out.println(Arrays.toString(str));

		for (int i = 0; i < 10; i++) {
			int tmp = (int) (Math.random() * 3);
			System.out.println(str[tmp]);
		}

	}

}
