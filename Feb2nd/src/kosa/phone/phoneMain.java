package kosa.phone;

import java.util.Scanner;

public class phoneMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		phoneManager pm = new phoneManager();
		while(true) {
			System.out.println("기능을 선택해 주세요.");
			System.out.println("1. 추가  2. 확인  3. 검색  4. 종료");
			String num = sc.nextLine();
			switch (num) {
			case "1":
				pm.addName();
				break;

			case "2":
				pm.printPhone();
				break;
			
			case "3":
				pm.searchPhone();
				break;
			
			case "4":
				System.out.println("주소록을 종료합니다.");
				return;
			}
		}
	}

}
