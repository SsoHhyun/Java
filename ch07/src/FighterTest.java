abstract class Unit2 {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
		System.out.println("멈춥니다.");
	}
}

interface Fightable { // 인터페이스의 모든 메서드는 public abstract
	void move(int x, int y); // public abstract 생략

	void attack(Fightable f); // public abstract 생략
}

class Fighter extends Unit2 implements Fightable {
	// 오버라이딩 규칙: 조상(public)보다 접근 제어자가 좁으면 안 된다
	// 안 쓰면 default가 되기 때문에 public이라고 명시해 줘야 한다
	public void move(int x, int y) {
		System.out.println("x: " + x + "만큼 이동, y: " + y + "만큼 이동");
	}

	public void attack(Fightable f) {
		System.out.println(f + "공격");
	}

	// 싸울 수 있는 상대 불러온다
	Fightable getFightable() {
		Fighter f = new Fighter(); // Fighter 생성해서 반환, 앞에 Fightable 생략
		return f;
	}
}

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		Unit2 f2 = new Fighter();
		Fightable f3 = new Fighter();
		Fightable f4 = f.getFightable();
		Unit2 u = new Fighter();

		f.move(100, 200);
		f.attack(new Fighter());
//		f.stop(); //Fightable에는 stop()이 없어서 호출 불가		
		f2.move(300, 400);
		f3.move(400, 500);
		f3.attack(new Fighter());
		u.move(99, 9);
//		u.attack(); // Unit2에는 attack()이 없어서 호출 불가
		u.stop();
	}

}
