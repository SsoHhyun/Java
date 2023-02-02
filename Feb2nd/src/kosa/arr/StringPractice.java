package kosa.arr;

import java.util.Scanner;

public class StringPractice {
	static int cnt = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 배열에 문자열 추가, 출력, 검색, 수정, 삭제
		String[] arr = new String[100];
		
		while(true) {
			System.out.println("출석부입니다.");
			System.out.println("1. 추가  2. 출력  3. 검색  4. 수정  5. 삭제  6. 종료");
			System.out.println("번호 입력: ");
			String num = sc.nextLine();
			switch (num) {
			case "1" :
				add(arr);
				break;
			case "2" :
				print(arr);
				break;
			case "3" :
				search(arr);
				break;
			case "4" :
				update(arr);
				break;
			case "5" :
				delete(arr);
				break;
			case "6" :
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
	
	// 5. 삭제
	private static void delete(String[] arr) {
		System.out.println("삭제할 이름: ");
		int idx = -1;
		String name = sc.nextLine();
		for(int i = 0; i < cnt; i++) {
			if(name.equals(arr[i])) {
				idx = i;
			}
		}
		if(idx != -1) {
			for(int i = idx; i < cnt; i++) {
				arr[i] = arr[i+1];
			}
			cnt--;
		}else
			System.out.println("출석부에 그런 이름은 존재하지 않습니다.");
		
	}

	// 4. 수정
	private static void update(String[] arr) {
		System.out.println("수정할 이름: ");
		int idx = -1;
		String name = sc.nextLine();
		for(int i = 0; i < cnt; i++) {
			if(name.equals(arr[i])) {
				idx = i;
			}
		}
		if(idx != -1) {
			System.out.println("수정 후 이름: ");
			String change = sc.nextLine();
			System.out.println(arr[idx] +"(이)가 " +change +"(으)로 수정되었습니다.");
			arr[idx] = change;
		}else
			System.out.println("출석부에 그런 이름은 존재하지 않습니다.");
		
	}

	// 3. 찾기
	private static void search(String[] arr) {
		System.out.println("찾고 싶은 이름: ");
		int idx = -1;
		String name = sc.nextLine();
		for(int i = 0; i < cnt; i++) {
			if(name.equals(arr[i])) {
				idx = i;
			}
		}
		if(idx != -1)
			System.out.println((idx+1) +"번에 " + name + "이 있습니다.");
		else
			System.out.println("출석부에 그런 이름은 존재하지 않습니다.");
	}
	
	// 2. 출력
	private static void print(String[] arr) {
		System.out.println("모든 이름을 출력합니다.");
		for(int i = 0 ; i < cnt; i++)
			System.out.println(arr[i]);
		System.out.println("명단 끝.");
	}

	// 1. 추가
	private static void add(String[] arr) {
		System.out.println("이름: ");
		arr[cnt++] = sc.nextLine();
	}

}
