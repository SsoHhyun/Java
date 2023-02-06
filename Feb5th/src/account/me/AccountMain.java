package account.me;

public class AccountMain {
	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount("110392023232", "안유진", 9122230, "111223");
		try {
			ca.pay("111223", 1223423);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ca.printAccount();
		}
	}
}
