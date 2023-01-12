class Tv {
	// 부모 멤버 5개
	boolean power; // 전원 상태 (on/off)
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}

// 자식 멤버 2개
// 총 멤버 7개
class SmartTv extends Tv { // 스마트TV는 TV에 자막 기능 제공
	boolean caption; // 자막 상태 (on/off)
	// 자막이 on일 때만 text를 보여 준다

	void showCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}

}

public class Ex7_1 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		// 조상 클래스로부터 상속받은 멤버
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		
		stv.showCaption("Hello, world!");
		// 자막 켜기
		stv.caption = true;
		stv.showCaption("Hello, world!");

	}

}
