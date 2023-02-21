import java.io.File;

public class Ex8_3 {
	public static void main(String[] args) {
		try {
			File f = createFile(""); // 파일 이름 넣기 (예외 발생)
			System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
		}
	}
		
	// 예외를 선언하는 것만으로는 예외를 처리한 게 아니다
	 static File createFile(String fileName) throws Exception {
		 if(fileName == null || fileName.equals(""))
			 throw new Exception("파일 이름이 유효하지 않습니다.");
		 // File 클래스의 객체 만들기
		 File f = new File(fileName);
		 // File 객체의 createNewRile 메서드 이용하여 실제 파일 생성
		  f.createNewFile();
		 // 생성된 객체의 참조 변수 반환
		  return f;
	}
}
