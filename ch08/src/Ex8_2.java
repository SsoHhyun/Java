public class Ex8_2 {
	public static void main(String[] args) {
		// throw new Exception(); // 컴파일 에러 발생
		// throw new RuntimeException(); // 컴파일 에러는 발생하지 않지만, 에러 발생
		// Exception in thread "main" java.lang.RuntimeException at Ex8_2.main(Ex8_2.java:6)
		// 컴파일 에러가 발생하지 않는다고 해서 에러가 아예 발생하지 않는 것은 아님
		
		// 에러 방지 위해 try-catch에 넣기
		try {
			// RuntimeException과 그 자손은 예외 처리 해 주지 않아도 컴파일이 된다
			throw new RuntimeException(); // Exception 고의로 발생시키기
			// throw new Exception(); // Exception과 그 자손은 예외 처리 필수
		} catch (Exception e) {
		}
	}
}
