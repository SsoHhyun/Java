package kosa.acc2;

public class Account {
	private String accNum;
	private String accName;
	private int balance;
	
	// 기본 생성자
	public Account() {
	}
	
	// 생성자
	public Account(String accNum, String accName, int balance) {
		super();
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	
	// 계좌 조회
	public void readAcc() { 
		System.out.println("이름: " + accName);
		System.out.println("계좌 번호: " + accNum);
		System.out.println("잔액: " + balance);
	}
	
	// 입금
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금
	public int withdraw(int money) {
		if(money <= balance) {
			balance -= money;
			return money;
		} else {
			System.out.println("잔액이 부족하여 출금할 수 없습니다.");
			return -1;
		}
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
