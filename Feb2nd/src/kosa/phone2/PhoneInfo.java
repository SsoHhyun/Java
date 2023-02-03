package kosa.phone2;

public class PhoneInfo {
	String name;
	String no;
	String birth;
	
	// 기본 생성자
	public PhoneInfo() {
	}

	public PhoneInfo(String name, String no, String birth) {
		super();
		this.name = name;
		this.no = no;
		this.birth = birth;
	}
	
	// 출력
	public void show() {
		System.out.println("이름: " + name);
		System.out.println("번호: " + no);
		System.out.println("생일: " + birth);
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
	
}
