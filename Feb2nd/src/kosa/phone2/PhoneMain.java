package kosa.phone2;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneManager pm = new PhoneManager();
		while(true) {
			System.out.println("주소록입니다.");
			System.out.println("1. 연락처 추가  2. 연락처 출력  3. 연락처 찾기  4. 주소록 종료");
			System.out.println("번호 입력: ");
			String num = sc.nextLine();
			switch (num) {
			case "1":
				pm.add();
				break;

			case "2":
				pm.print();
				break;
				
			case "3":
				pm.search();
				break;

			case "4":
				System.out.println("주소록을 종료합니다.");
				return;
			}
		}
	}

}
