package ch09;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		// 원래는 ArrayList에 객체만 저장 가능
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); // JDK 1.5 이전에는 에러
		list.add(new Integer(100)); // list에는 객체만 추가 가능
		
		Integer i = list.get(0); // list에 저장된 첫 번째 객체 꺼내기
		int i2 = list.get(0).intValue(); // 원래는 intValue()로 Integer를 int로 변환해야 한다
		int i3 = list.get(0); // 컴파일러가 자동으로 변환 (언박싱)
	}
}
