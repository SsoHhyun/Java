package pkg2;

import pkg1.MyParent; // ctrl + shift + o

class MyChild extends MyParent {
	public void printMembers() {
		System.out.println(prv); // 에러 (같은 클래스 안에서만)
		System.out.println(dft); // 에러 (같은 패키지 안에서만)
		System.out.println(prt); // OK (다른 패키지의 자손)
		System.out.println(pub); // OK
	}
}

public class MyParentTest2 {
	public static void main(String[] args) {
		MyParent p = new MyParent();
		System.out.println(p.prv); // 에러 (클래스가 다름)
		System.out.println(p.dft); // 에러 (패키지가 다름)
		System.out.println(p.prt); // 에러 (패키지 다르고, 자손도 아님)
		System.out.println(p.pub); // OK (접근 제한 없음)

	}

}
