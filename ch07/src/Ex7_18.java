import java.awt.*;

class Ex7_18 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		// 클래스의 정의와 객체 생성을 동시에
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occured!");
			}
		});
	}
}
