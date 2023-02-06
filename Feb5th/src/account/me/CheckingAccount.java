package account.me;

public class CheckingAccount extends Account {
	private String cardNo;
	
	public CheckingAccount() {
	}

	public CheckingAccount(String no, String owerName, int balance, String cardNo) {
		super(no, owerName, balance);
		this.cardNo = cardNo;
	}
	
	public int pay(String cardNo, int money) throws Exception {
		if(!cardNo.equals(this.cardNo) || getBalance() < money) {
			throw new Exception("잔액 부족으로 결제할 수 없습니다.");
		}
		return withdraw(money);
	}
	
}
