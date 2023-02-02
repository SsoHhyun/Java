package kosa.acc;

public class Acc {
	private String accNum;
	private String name;
	private int balance;

	// 기본 생성자
	Acc() {
	}

	public Acc(String accNum, String name, int balance) {
		super();
		this.accNum = accNum;
		this.name = name;
		this.balance = balance;
	}

	// 잔액 조회
	public void show() {
		System.out.println("계좌 번호: " + accNum);
		System.out.println("이름: " + name);
		System.out.println("잔액: " + balance);
	}

	// 입금
	public void deposit(int money) {
		balance += money;
	}

	// 출금
	public int withdraw(int money) {
		if (balance > money) {
			balance -= money;
			return money;
		}
		else {
			System.out.println("출금액이 잔액을 초과하여 출금할 수 없습니다.");
			return 0;
		}
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
