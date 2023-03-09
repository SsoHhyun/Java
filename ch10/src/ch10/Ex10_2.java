package ch10;

import java.util.Calendar;

public class Ex10_2 {

	public static void main(String[] args) {
		// 요일은 1부터 시작, 배열 첫 칸 비워 두기
		final String[] DAY_OF_WEEK = { "", "일", "월", "화", "수", "목", "금", "토" };

		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		// month는 0부터 시작. 4월 -> 3, 12월 -> 11으로 지정

		// cal1.set(2045, Calendar.APRIL, 23);
		cal1.set(2045, 3, 23); // 2045년 4월 23일

		// System.out.println("cal1은 " + tostring);

		// 두 날짜 간 차이 비교
		// getTimeInMillis() 메서드 이용하여 1000분의 1초 단위로 변환
		long diff = (cal1.getTimeInMillis() - cal2.getTimeInMillis()) / 1000;
		System.out.println("cal1까지는 cal2부터 " + diff + "초가 경과해야 합니다.");
		System.out.println("일로 계산하면 " + diff / (24 * 60 * 60) + "일입니다.");
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일";
	}

}
