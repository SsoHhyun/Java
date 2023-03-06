package ch09;

public class NumberTest {
	public static void main(String[] args) {
		int i = Integer.parseInt("100");
		int i2 = Integer.parseInt("100", 2);
		System.out.println("i = " + i);
		// 2진수로 100은 4
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + Integer.parseInt("FF", 16));
	}
}
