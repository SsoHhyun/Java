package account2.me;

public class Account {
	private int no;
	private String name;
	private int balance;
	
	public Account() {
	}

	public Account(int no, String name, int balance) {
		super();
		this.no = no;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public int withdraw(int money) {
		if(balance < money) {
			return 0;
		}
		balance -= money;
		return balance;
	}
	
	public void show() {
		System.out.println("계좌 번호: " + no);
		System.out.println("예금주: " + name);
		System.out.println("잔액: " + balance);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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
