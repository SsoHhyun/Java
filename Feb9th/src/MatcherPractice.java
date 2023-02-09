import java.util.Scanner;

public class MatcherPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// abc 문자열 포함
//		if(str.matches(".*abc.*"))
//			System.out.println("일치");
//		else
//			System.out.println("불일치");

		// 문자열이 숫자만 3자리
//		if(str.matches("[\\d]{3}"))
//			System.out.println("일치");
//		else
//			System.out.println("불일치");

		// 알파벳, 숫자만 5자리 이상
//		if(str.matches("[\\w]{5,}"))
//			System.out.println("일치");
//		else
//			System.out.println("불일치");

		// 이메일 검증
//		if(str.matches("^[\\D]\\w+@\\w+\\.\\w{2,3}$")) {
//			System.out.println("일치");
//		} else {
//			System.out.println("불일치");
//		}

		// 이미지 파일 검증 (jpg, gif, PNG, txt)
		if (str.matches("^\\S+\\.(?i)(jpg|gif|PNG)$"))
			System.out.println("이미지 파일입니다.");
		else
			System.out.println("이미지 파일이 아닙니다.");
	}

}
