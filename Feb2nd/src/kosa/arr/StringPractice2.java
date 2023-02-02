package kosa.arr;

import java.util.Scanner;

public class StringPractice2 {
	static int cnt = 0;
	static Scanner sc = new Scanner(System.in);

	// 1. 추가
	static void add(String[] arr) {
		System.out.println("추가할 이름: ");
		arr[cnt++] = sc.nextLine();
	}

	// 2. 출력
	static void print(String[] arr) {
		System.out.println("전체 명단을 출력합니다.");
		for (int i = 0; i < cnt; i++) {
			System.out.println(arr[i]);
		}
	}

	// 3. 검색
	static void search(String[] arr) {
		int idx = -1;
		System.out.println("검색할 이름: ");
		String name = sc.nextLine();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(name)) {
				idx = i;
				break;
			}
		}
		if (idx == -1)
			System.out.println("출석부에 해당 이름이 없습니다.");
		else
			System.out.println((idx + 1) + "번에" + name + "이 있습니다.");
	}
	
	// 4. 수정
	static void update(String[] arr) {
		int idx = -1;
		System.out.println("찾는 이름: ");
		String name = sc.nextLine();
		for(int i = 0; i < cnt; i++) {
			if(name.equals(arr[i])) {
				idx = i;
				break;
			}
		}
		if(idx == -1)
			System.out.println("찾는 이름이 없습니다.");
		else {
			System.out.println("수정할 이름: ");
			arr[idx] = sc.nextLine();
		}
	}
	
	// 5. 삭제
	static void delete(String[] arr) {
		int idx = -1;
		System.out.println("삭제할 이름: ");
		String name = sc.nextLine();
		for(int i = 0; i < cnt; i++) {
			if(arr[i].equals(name)) {
				idx = i;
				break;
			}
		}
		if(idx == -1)
			System.out.println("삭제할 이름이 없습니다.");
		else {
			for(int i = idx ; i < cnt; i++) {
				arr[i] = arr[i+1];
			}
			cnt--;
		}
			
	}

	public static void main(String[] args) {
		// 배열에 문자열 추가, 출력, 검색, 수정, 삭제
		String[] arr = new String[50];
		while (true) {
			System.out.println("출석부입니다.");
			System.out.println("1. 이름 추가 2. 이름 출력 3. 이름 검색 4. 이름 수정 5. 이름 삭제 6. 출석부 종료");
			System.out.println("번호 입력: ");
			String num = sc.nextLine();
			switch (num) {
			case "1":
				add(arr);
				break;

			case "2":
				print(arr);
				break;
			
			case "3":
				search(arr);
				break;
			
			case "4":
				update(arr);
				break;
				
			case "5":
				delete(arr);
				break;

			case "6":
				System.out.println("출석부를 종료합니다.");
				return;
			}

		}
	}

}
