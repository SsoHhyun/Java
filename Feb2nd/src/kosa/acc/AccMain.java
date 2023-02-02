package kosa.acc;

public class AccMain {

	public static void main(String[] args) {
		Acc a = new Acc("1111-2222", "김민주", 10000);
		Acc a2 = new Acc("3333-4444", "김채원", 20000);
		a.show();
		a.deposit(3000);
		a.setAccNum("8888-2323");
		a.show();
		a2.show();
		a2.setName("안유진");
		a2.withdraw(40000);
		a2.show();
	}

}
