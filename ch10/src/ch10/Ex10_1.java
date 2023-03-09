package ch10;

import java.util.Calendar;

public class Ex10_1 {
	public static void main(String[] args) {
		// Calendar 객체 생성 => 기본적으로 현재 날짜와 시간으로 설정
		Calendar today = Calendar.getInstance();
		System.out.println("올해: " + today.get(Calendar.YEAR));
		System.out.println("월(0~11, 0: 1월): " + today.get(Calendar.MONTH));
		System.out.println("올해의 몇째 주: " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이달의 몇째 주: " + today.get(Calendar.WEEK_OF_MONTH));

		// DATE와 DAY_OF_MONTH는 같다
		System.out.println("이달의 며칠: " + today.get(Calendar.DATE));
		System.out.println("이달의 며칠2: " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("올해의 며칠: " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7, 1: 일요일): " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("이달의 몇 번째 요일: " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전, 오후(0: 오전, 1: 오후): " + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11): " + today.get(Calendar.HOUR));
		System.out.println("분(0~59): " + today.get(Calendar.MINUTE));
		System.out.println("초(0~59): " + today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999): " + today.get(Calendar.MILLISECOND));

		// 1000분의 1초를 시간으로 표시하기 위해 3,600,000으로 나누기 (1시간이 3,600초니까)
		System.out.println("TimeZone(-12~12: " + (today.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000)));
		System.out.println("이달의 마지막 날: " + today.getActualMaximum(Calendar.DATE));
	}
}
