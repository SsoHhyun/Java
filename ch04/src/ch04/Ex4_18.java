package ch04;

import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {
		int menu = 0, num = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. 불고기버거");
			System.out.println("2. 초밥");
			System.out.println("3. 파스타");
			System.out.println("1~3번 중에 메뉴를 선택하세요. (종료 : 0번)");

			String str = sc.nextLine();
			menu = Integer.parseInt(str);

			if (menu == 0) {
				System.out.println("키오스크를 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다. 종료는 0번입니다.");
				continue;
			}
			System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
		}

	}

}
