package ch06;

public class Ex6_1 {
	public static void main(String[] args) {
		// 객체 생성
		Tv t; // Tv 인스턴스를 참조하기 위한 변수 t 선언
		t = new Tv(); // Tv 인스턴스 생성
		
		// 객체 사용
		// 1. 변수 사용
		t.channel = 11; // Tv 인스턴스의 멤버 변수 channel의 값을 11로 하기
		// 2. 메서드 사용
		t.channelDown(); // Tv 인스턴스의 메서드 channelDown() 호출하기
		System.out.println("현재 채널은 " + t.channel + "입니다.");
	}
}

class Tv {
	// Tv 속성 (멤버 변수)
	String color; // 색상
	boolean power; // 전원 상태(on/off)
	int channel; // 채널

	// Tv 기능 (메서드)
	void power() { // TV를 켜거나 끄는 기능을 하는 메서드
		power = !power;
	}

	void channelUp() { // TV 채널을 높이는 기능을 하는 메서드
		++channel;
	}

	void channelDown() { // TV 채널을 낮추는 기능을 하는 메서드
		--channel;
	}

}
