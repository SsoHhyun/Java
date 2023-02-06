package account.me;

public class Account {
	private String no;
	private String owerName;
	private int balance;
	
	public Account() {
	}
	
	public Account(String no, String owerName, int balance) {
		super();
		this.no = no;
		this.owerName = owerName;
		this.balance = balance;
	}

	// 입금
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금
	public int withdraw(int money) {
		if(balance < money)
			return 0;
		else {
			balance -= money;
			return money;
		}
	}
	
	// 계좌 정보 출력
	public void printAccount() {
		System.out.println("계좌번호: " + no);
		System.out.println("계좌 주인: " + owerName);
		System.out.println("잔액: " + balance);
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getOwerName() {
		return owerName;
	}

	public void setOwerName(String owerName) {
		this.owerName = owerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
