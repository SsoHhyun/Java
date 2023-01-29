
class Outer {
	private int outerIv = 0;
	private static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv; // 1. 외부 클래스의 private 멤버도 접근 가능하다.
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		// static 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
//		int siv = outerIv;
		static int scv = outerCv;
	}
	
	// 상수는 따로 저장해서 관리하기 때문에 method가 종료되어도 사용할 수 있다
	void myMethod() {
		// lv가 변수지만 값을 변경하는 코드가 없으므로 실제로는 상수와 같다
		int lv = 0;
		final int LV = 0; // JDK 1.8부터 final 생략 가능
//		lv = 3; // 값 바꾸면 상수로 간주될 수 없어서 에러 난다
		
		class LocalInner { // 2. 지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용 가능하다.
			int liv = outerIv;
			int liv2 = outerCv;
		// 외부 클래스의 지역 변수는 final이 붙은 변수(상수)만 접근 가능하다
			int liv3 = lv; // 원래는 에러였으나 JDK 1.8부터 에러 아님
			int liv4 = LV; // 가능
		}
	}
	
	public static void main(String[] args) {

	}

}
