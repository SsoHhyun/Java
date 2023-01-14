
class Time {
	private int hour; // 0~23 사이
	private int min;
	private int second;
	
	public void setHour(int hour) {
		// alt + shift + m : 메서드 추출
		if(isNotValidHour(hour))
			return;
		this.hour = hour;
	}
	
	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
	// 내부에서만 쓰이니까 private로 해도 상관없다
	private boolean isNotValidHour(int hour) {
		return hour <0 || hour > 23;
	}
	
	public int getHour() {
		return hour;
	}
}

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
		// t.hour = 25;
		t.setHour(21); // hour의 값을 25로 변경
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());

	}

}
