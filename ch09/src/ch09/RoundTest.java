package ch09;

public class RoundTest {
	public static void main(String[] args) {
		for (double d = 0.0; d <= 2.0; d += 0.1) {
			double d1 = Math.round(d);
			double d2 = Math.rint(d);
			System.out.print(d + " ");
			System.out.print(d1 + " ");
			System.out.print(d2 + " \n");
		}
	}
}
