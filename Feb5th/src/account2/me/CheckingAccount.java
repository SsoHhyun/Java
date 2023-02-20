package account2.me;

public class CheckingAccount extends Account {
	int cardNo;
	
	public CheckingAccount() {
	}

	public CheckingAccount(int no, String name, int balance, int cardNo) {
		super(no, name, balance);
		this.cardNo = cardNo;
	}
	
	public int pay(int cardNo, int money) throws Exception {
		if(cardNo != this.cardNo || getBalance() < money) {
			throw new Exception("잔액 부족으로 결제할 수 없습니다");
		}
		return withdraw(money);
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("카드 번호: " + cardNo);
	}
	
	
	
	

}
