class Kitty extends Object {
	String color;
	int age;
	String name;
}
public class Ex7_3 {
	public static void main(String[] args) {
		Kitty k = new Kitty();
		System.out.println(k.toString()); //Kitty@2a139a55
		System.out.println(k); // toString을 안 붙여도 똑같은 결과가 나온다
		Kitty k2 = new Kitty();
		System.out.println(k2.toString()); // 객체를 새로 만들면 다른 주소 값이 나온다
	}

}
