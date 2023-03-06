package ch09;

public class Ex9_5 {
	public static void main(String[] args) {
		int num = 100;
		// int -> String으로 변환
		String snum = String.valueOf(num);

		double dnum = 200.0;
		// int -> String으로 변환
		String sdnum = dnum + "";
		
		// 문자열을 숫자로 바꾸기
		double sum = Integer.parseInt("+" + snum)
				+ Double.parseDouble(sdnum);
		double sum2 = Integer.valueOf(snum) + Double.valueOf(sdnum);
		
		// 구분자를 빈칸으로 주기
		System.out.println(String.join("", snum, "+", sdnum, "=")+sum);
		System.out.println(snum + "+" + sdnum + "=" + sum);
	}
}
