package kosa.phone2;

import java.util.Scanner;

public class PhoneManager {
	static Scanner sc = new Scanner(System.in);
	static int cnt;
	PhoneInfo[] arr = new PhoneInfo[100];
	
	// 1. 추가
	public void add() {
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("번호: ");
		String no = sc.nextLine();
		System.out.println("생일: ");
		String birth = sc.nextLine();
		arr[cnt++] = new PhoneInfo(name, no, birth);
	}
	
	// 2. 출력
	public void print() {
		for(int i = 0; i< cnt; i++) {
			arr[i].show();
		}
	}
	
	// 3. 검색
	public void search() {
		System.out.println("검색할 이름: ");
		int idx = -1;
		String name = sc.nextLine();
		for(int i = 0; i < cnt; i++) {
			if(arr[i].getName().equals(name)) {
				idx = i;
				break;
			}
		}
		if(idx != -1) {
			System.out.println("검색 결과");
			arr[idx].show();
		} else {
			System.out.println("검색 결과가 없습니다.");
		}
	}
}