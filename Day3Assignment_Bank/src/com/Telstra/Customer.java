package com.Telstra;

public class Customer{
	
	private int custId;
	private String custName;
	private Account acc;
    
	
	

	public Customer(int custId, String custName, Account acc) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.acc = acc;
	}

    


	public int getCustId() {
		return custId;
	}




	public void setCustId(int custId) {
		this.custId = custId;
	}




	public String getCustName() {
		return custName;
	}




	public void setCustName(String custName) {
		this.custName = custName;
	}




	public Account getAcc() {
		return acc;
	}




	public void setAcc(Account acc) {
		this.acc = acc;
	}




	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", acc=" + acc + "]";
	}




	
    
	




	
	
	

}
