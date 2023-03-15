package ch10;

import java.util.Calendar;

public class Ex10_4 {
	static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		int diff = 0;

		try {
			int year1 = Integer.parseInt(yyyymmdd1.substring(0, 4));
			int month1 = Integer.parseInt(yyyymmdd1.substring(4, 6)) - 1;
			int day1 = Integer.parseInt(yyyymmdd1.substring(6, 8));
			Calendar date1 = Calendar.getInstance();
			// 초기화를 안 해 주면 오차로 인하여 정확한 값이 나오지 않을 수 있다
			date1.clear();
			date1.set(year1, month1, day1);

			int year2 = Integer.parseInt(yyyymmdd2.substring(0, 4));
			int month2 = Integer.parseInt(yyyymmdd2.substring(4, 6)) - 1;
			int day2 = Integer.parseInt(yyyymmdd2.substring(6, 8));
			Calendar date2 = Calendar.getInstance();
			date2.clear();
			date2.set(year2, month2, day2);

			diff = (int) ((date1.getTimeInMillis() - date2.getTimeInMillis()) / (24 * 60 * 60 * 1000));

		} catch (Exception e) {
			diff = 0;
		}
		return diff;
	}

	public static void main(String[] args) {
		System.out.println(getDayDiff("20230709", "20581105"));
		System.out.println(getDayDiff("19990326", "20451203"));
		System.out.println(getDayDiff("20230315", "20230317"));
	}

}
