package study.ex;

import java.io.File;

public class Ex2 {

	public static void main(String[] args) {
		try {
			File f = createFile("");
			System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + "다시 입력해 주시기 바랍니다.");
		}

	} // main 끝

	static File createFile(String fileName) throws Exception {
		if (fileName == null || fileName.equals(""))
			throw new Exception("파일 이름이 유효하지 않습니다. ");
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}

}
