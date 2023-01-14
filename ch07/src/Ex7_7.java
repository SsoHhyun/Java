
public class Ex7_7 {

	public static void main(String[] args) {
		// 형 변환이 중요한 게 아니라 실제로 가리키는 게 무엇인지가 중요
		// 참조변수가 가리키는 실제 인스턴스를 확인하고, 그게 멤버 개수를 넘어서면 안 된다
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe; // car = (car)fe;에서 형 변환 생략
//		car.water(); 에러. Car 타입의 참조변수인 car로는 water()를 사용 불가.
		fe2 = (FireEngine) car; // 자손 타입 <- 조상타입. 형 변환 생략 불가
		fe2.water();

	}

}

class Car {
	String color;
	int door;

	void drive() {
		System.out.println("drvie, brr~");
	}

	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car { // 소방차
	void water() {
		System.out.println("water~~~~");
	}
}