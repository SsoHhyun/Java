package account2.me;

public class Main {
	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount(110343443, "김지은", 900000, 1);
		try {
			ca.pay(1, 10000000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		ca.show();
	}
}
