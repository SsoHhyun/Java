// 상속

class Point {
	int x;
	int y;
}

class Circle extends Point {
	int r;

}

// 포함
class MyPoint {
	int x;
	int y;
}

class MyCircle {
	// 참조 변수의 초기화
	MyPoint p = new MyPoint();
	int r;
	
	// 참조 변수 초기화 방법 2
	// 생성자에서 초기화
	MyCircle() {
		p = new MyPoint();
	}
}

public class Ex7_2 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.x = 1;
		c.y = 2;
		c.r = 3;
		System.out.println("c.x=" + c.x);
		System.out.println("c.y=" + c.y);
		System.out.println("c.r=" + c.r);

		MyCircle mc = new MyCircle();
		mc.p.x = 4;
		mc.p.y = 5;
		mc.r = 6;
		System.out.println("mc.p.x=" + mc.p.x);
		System.out.println("mc.p.y=" + mc.p.y);
		System.out.println("mc.r=" + mc.r);

	}

}
