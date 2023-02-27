package ch09;

public class Ex9_1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}
}

class Value {
	int value;

	Value(int value) {
		this.value = value;
	}
	
	// Object의 equals()를 오버라이딩해서 주소가 아닌 value를 비교
	public boolean equals(Object obj) {
		// obj를 value로 형 변환
		// 참조 변수 형 변환 전에는 반드시 instanceof로 확인해야 함
		if (!(obj instanceof Value))
			return false;
		Value v = (Value) obj;

		// return this == obj; -> 주소 비교
		// 주소 비교 시 서로 다른 객체는 항상 거짓
		return this.value == v.value;
	}
}
