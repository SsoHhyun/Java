package ch10;

import java.util.Calendar;

public class Ex10_6 {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage: java Ex10_5 2023 3");
			return;
		}

		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0; // 1일의 요일
		int END_DAY = 0;

		Calendar sDay = Calendar.getInstance(); // 시작일
		Calendar eDay = Calendar.getInstance(); // 끝일

		// 시작하는 날 (month는 0부터 시작)
		sDay.set(year, month - 1, 1);
		// 다음 달
		eDay.set(year, month, 1);

		// 다음 달의 첫날에서 하루 빼서 마지막 날 구하기
		// 달마다 마지막 날이 다르기 때문
		eDay.add(Calendar.DATE, -1);

		// 첫날이 무슨 요일 가져오기
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);

		// 날짜 가져오기
		END_DAY = eDay.get(Calendar.DATE);

		System.out.println("      " + year + "년 " + month + "월");
		System.out.println(" SU MO TU WE TH FR SA");

		// 해당 월의 첫날이 어떤 요일인지에 따라 공백 출력
		for (int i = 1; i < START_DAY_OF_WEEK; i++) {
			System.out.print("   ");
		}

		for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.print((i < 10) ? "  " + i : " " + i);
			if (n % 7 == 0)
				System.out.println();
		}

	}

}
