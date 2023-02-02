package kosa.phone;

import java.util.Scanner;

public class phoneManager {
	phone[] arr = new phone[100];
	static Scanner sc = new Scanner(System.in);
	int cnt;

	// 이름 추가
	public void addName() {
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("번호: ");
		int phoneNo = Integer.parseInt(sc.nextLine());
		System.out.println("생년월일: ");
		String birth = sc.nextLine();
		arr[cnt++] = new phone(name, phoneNo, birth);
	}

	// 이름 출력
	public void printPhone() {
		for (int i = 0; i < cnt; i++) {
			arr[i].showPhone();
		}
	}

	// 이름 검색
	public void searchPhone() {
		int idx = -1;
		System.out.println("찾는 이름: ");
		String name = sc.nextLine();
		for (int i = 0; i < cnt; i++) {
			if (arr[i].getName().equals(name)) {
				idx = i;
				break;
			}
		}
		if (idx == -1)
			System.out.println("검색 결과 없음");
		else {
			System.out.println(idx + "번");
			arr[idx].showPhone();
		}
	}

}
