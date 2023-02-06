package bank1.me;

public class MyBank {
	private Customer[] customers;
	private int customersNum;
	
	public MyBank() {
		customers = new Customer[100];
	}
	

	public MyBank(Customer[] customers, int customersNum) {
		this.customers = customers;
		this.customersNum = customersNum;
	}
	
	public void addCustomer(String id, String name, Long balance) {
		customers[customersNum++] = new Customer(id, name, balance);
	}
	
	public Customer getCustomer(String id) {
		Customer cs = null;
	//	Customer cs = new Customer();
		for(int i = 0; i < customersNum; i++) {
			if(customers[i].getId().equals(id)) {
			cs = customers[i];
			break;
			}
		}
		return cs;
	}
	
	public Customer[] getAllCustomers() {
		Customer[] newCustomers = new Customer[customersNum];
		System.arraycopy(customers, 0, newCustomers, 0, customersNum);
		return newCustomers;
	}
	
	


}
