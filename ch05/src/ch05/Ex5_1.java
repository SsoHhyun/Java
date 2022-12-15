package ch05;

// ctrl + shift + o : 자동 임포트
import java.util.Arrays;

public class Ex5_1 {

	public static void main(String[] args) {
		int[] iArr = { 100, 95, 80, 70, 60 }; // int 배열의 길이 5
		// 1. 반복문
		for(int i = 0; i < iArr.length; i++)
			System.out.println(iArr[i]);
		
		// 2. Arrays 클래스 이용
		System.out.println(Arrays.toString(iArr));
	}

}
