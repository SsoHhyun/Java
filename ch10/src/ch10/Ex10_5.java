package ch10;

import java.util.Calendar;

public class Ex10_5 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2023, 9, 31); // 2023년 10월 31일

		System.out.println(toString(date));
		date.add(Calendar.DATE, 1);
		System.out.println("1일 후: " + toString(date));

		date.add(Calendar.MONTH, -6);
		System.out.println("6개월 전: " + toString(date));
		
		// roll은 다른 필드에 영향을 주지 않는다
		date.roll(Calendar.DATE, 31);
		System.out.println("31일 후(roll): " + toString(date));

		date.add(Calendar.DATE, 31);
		System.out.println("31일 후(add): " + toString(date));

	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일";
	}

}
