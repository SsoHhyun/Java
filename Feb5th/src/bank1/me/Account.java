package bank1.me;

public class Account {
	private String id;
	private Long balance;
	
	public Account() {
	}

	public Account(String id, Long balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public void deposit(Long money) {
		balance += money;
	}
	
	public boolean withdraw(Long money) {
		if(balance >= money) {
			balance -= money;
			return true;
		}
		return false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}
	
	

}
