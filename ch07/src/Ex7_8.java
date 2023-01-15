class Product {
	int price; // 제품 가격
	int bonusPoint; // 제품 구매 시 제공하는 보너스 포인트

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0); // 보너스 포인트는 제품 가격의 10%
	}

}

class Tv1 extends Product {
	Tv1() {
		// 조상 클래스 생성자 Product(int price) 호출
		super(100); // Tv: 100원
	}

	// Object 클래스의 toString() 오버라이딩
	public String toString() {
		return "Tv";
	}

}

class Computer extends Product {
	Computer() {
		super(200); // 컴퓨터: 200원
	}

	public String toString() {
		return "computer";
	}
}

// 구매자
class Buyer {
	int money = 1000; // 보유 금액
	int bonusPoint = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을(를) 구입하셨습니다.");
//		System.out.println(p.toString() + "을(를) 구입하셨습니다."); // 같은 코드
		
	}
}

public class Ex7_8 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		// 위 두 줄을 줄인 게 아래 한 줄
//		Product p = new Tv1();
//		b.buy(p);
		
		// 차이점: 이렇게 바로 Tv1을 호출하면 참조 변수가 없기 때문에 main 메서드 안에서는 사용 불가능하다
		// buy 메서드 안에서는 쓸 수 있다
		b.buy(new Tv1()); // buy(Product p)
		b.buy(new Computer()); // buy(Product p)
		
		System.out.println("현재 잔액은 " + b.money + "원입니다.");
		System.out.println("현재 보너스 포인트는 " + b.bonusPoint + "점입니다.");

	}

}
