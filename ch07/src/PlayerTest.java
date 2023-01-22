abstract class Player { // 추상 클래스(미완성 클래스, 미완성 설계도)
	abstract void play(int pos); // 추상 메서드(미완성 메서드)
	abstract void stop(); // 추상 메서드: 선언부만 있고, 구현부{}가 없는 메서드
}

// 추상 클래스는 상속을 통해 완성해야 객체 생성 가능
class AudioPlayer extends Player {
	void play(int pos) {
		System.out.println(pos + "부터 play합니다.");
	}
	void stop() {
		System.out.println("재생을 멈춥니다.");
	}
}

//모든 메서드를 구현하지 않는다면 추상 클래스
abstract class VideoPlayer extends Player { 
	void play(int pos) {
		System.out.println(pos + "부터 play합니다.");
	}
}

public class PlayerTest {
	public static void main(String[] args) {
		// Player p = new Player(); // 추상 클래스 객체 생성 (에러)
		AudioPlayer ap = new AudioPlayer();
		Player p = new AudioPlayer(); // 다형성 (실제 가리키는 객체는 AudioPlayer)
		p.play(88);
		p.stop();
		ap.play(100);
		ap.stop();
	}

}
