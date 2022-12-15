package ch05;

public class Ex5_5 {

	public static void main(String[] args) {
		int[] ball = new int[45]; // 45개의 정수 값 저장하려는 배열

		// 배열 각 요소에 1~45 저장
		for (int i = 0; i < ball.length; i++)
			ball[i] = i + 1;

		int tmp = 0; // 두 값 바꾸는 데 사용할 임시 변수
		int n = 0; // 임의의 값 얻어서 저장할 변수

		// 배열의 i 번째 요소와 임의 요소에 저장된 값을 서로 바꾸기
		// 0 번쨰부터 다섯 번째 요소까지 모두 여섯 개만 바꾸기
		for (int i = 0; i < 6; i++) {
			n = (int) (Math.random() * 45); //0부터 44 범위의 임의의 값
			tmp = ball[i];
			ball[i] = ball[n];
			ball[n] = tmp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.println("ball[" + i + "]=" + ball[i]);

		}
	}

}
