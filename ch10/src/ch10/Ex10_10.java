package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_10 {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			// 문자열을 날짜로 바꾸기
			Date d = df.parse("2023년 3월 15일");
			// 날짜를 문자열로 바꾸기
			System.out.println(df.format(d));
			System.out.println(df2.format(d));
		} catch (Exception e) {
		}
	}
}
