package ch05;

import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {
		int[] nArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(nArr));

		for (int i = 0; i < 100; i++) { // 100번 두 요소 값 바꾸기
			int n = (int) (Math.random() * 10); // 0부터 9 중 임의의 값 하나 얻기
			// nArr[0]과 nArr[n] 값 서로 바꿔 주기
			int tmp = nArr[0];
			nArr[0] = nArr[n];
			nArr[n] = tmp;
		}
		System.out.println(Arrays.toString(nArr));
	}

}
