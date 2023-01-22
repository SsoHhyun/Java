public class Ex7_10 {
	public static void main(String[] args) {
		// 베열의 선언과 초기화를 동시에 하기
		Unit[] group = { new Marine(), new Tank(), new Dropship() };
		//Object[] group = { new Marine(), new Tank(), new Dropship() }; // object로 바꾸면 error
		// The method move(int, int) is undefined for the type Object
		
		// 위와 똑같음
//		Unit[] group = new Unit[3];
//		group[0] = new Marine;
//		group[1] = new Tank();
//		group[2] = new Dropship();
		
		// group의 타입: Unit[] / group[0], group[1], group[2]의 타입: Unit
		for(int i = 0; i < group.length; i++)
			group[i].move(100, 200);
	}
}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
	}
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine의 x좌표: "+x+", y좌표: "+y);
	}
	void stimPack() {
	}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank의 x좌표: "+x+", y좌표: "+y);
	}
	void changeMode() {
	}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("Dropship의 x좌표: "+x+", y좌표: "+y);
	}
	void load() {
	}
	void unload() {
	}
}