
public class Ex2_3 {

	public static void main(String[] args) {
		final int score = 100;
		//score = 200; 상수는 값을 변경할 수 없다
		boolean power = true;
		
		byte b = 127; //~128 ~ 127
		int oct = 010; // 8진수, 10진수로 8
		int hex = 0x10; // 16진수, 10진수로 16
		
		long l = 10_000_000_000L;
		
		float f = 3.14f;
		double d = 3.14;
		
		char ch = 'a';
		int i = 'A';
		
		String str = ""; // 빈 문자열
		String str1 = "abdfjdlfdf";
		String str2 = "123";
		String str3 = str1 + str2;
		
		System.out.println(str3);
		System.out.println(""+7+7);
		System.out.println(7+7+"");

	}

}
