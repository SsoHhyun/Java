package kosa.acc2;

public class AccountMain {

	public static void main(String[] args) {
		Account ac = new Account("3434334343", "사쿠라", 90000);
		Account ac2 = new Account("39483009", "히토미", 50000);
		
		ac.readAcc();
		ac.deposit(80000);
		ac.readAcc();
		
		ac2.readAcc();
		ac2.withdraw(90000);
		ac2.setBalance(150000);
		ac2.readAcc();
	}

}
