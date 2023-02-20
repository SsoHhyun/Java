package bank2.me;

public class MyBank {
	private Customer[] customers;
	private int cusNo;
	
	public MyBank() {
		Customer[] customers = new Customer[100];
	}
	
	// 1. 고객 추가
	public void addCus(String id, String name, Long balance) {
		customers[cusNo++] = new Customer(id, name, balance);
	}
	
	// 2. 고객 정보
	public Customer getCus(String id) {
		Customer cust = null;
		for(int i = 0; i < cusNo; i++) {
			if(cust.getId().equals(id)) {
				cust = customers[i];
				break;
			}
		}
		return cust;
	}
	
	// 3. 고객 정보 다
	public Customer[] getAllCustomer() {
//		for(Customer cu: customers) {
//			System.out.println(customers);
//		}
//		return customers;
		Customer[] cust= new Customer[cusNo];
		System.arraycopy(customers, 0, cust, 0, cusNo);
		return cust;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	public int getCusNo() {
		return cusNo;
	}

	public void setCusNo(int cusNo) {
		this.cusNo = cusNo;
	}
	
	
	
	

}
