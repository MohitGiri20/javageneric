package com.Telstra;

import java.util.Scanner;

public class Bank {
	
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the account details");
		
		int accId;
		String accType;
		float bal;
		
		System.out.println("Enter your account Id:");
		accId = scn.nextInt();
		
		System.out.println("Enter account type (Savings/Current):");
		accType = scn.next();
		
		System.out.println("Enter the last updated balance in your account");
		bal = scn.nextFloat();
        
		Account acc = new Account(accId,accType,bal);
		//Account acc2 = new Account(1010,"Current",100000);
		
		System.out.println("Enter the customer details");
		
		int custId;
		String custName;
		
		System.out.println("Enter the customer Id");
		custId = scn.nextInt();
		
		System.out.println("Enter the customer Name");
		custName =scn.next();
		
		Customer c = new Customer(custId,custName,acc);
//		Customer c2 = new Customer(2,"Mahesh",acc2);
		
		
		float currBal=0f;
		
		System.out.println(c.getCustName()+"'s Transaction:");
		
		System.out.println("Enter the amount to be deposited:");
		float depAmount = scn.nextFloat();
		
		currBal = c.getAcc().deposit(depAmount);
		
		System.out.println("Your updated account balance is:" + currBal);
		
		System.out.println("Enter the amount to be withdrawn:");
		float withDrAmount = scn.nextFloat();
		
		
		currBal = c.getAcc().withdraw(withDrAmount);
		
		// Account Balance cannot be below 10000,(Min. Balance is 10000)
		System.out.println(currBal == -1 ? "Can't process withdrawal" : "Your updated account balance is:" + currBal);
		
		
		System.out.println("Your details with the bank with updated balance");
		System.out.println(c.toString());
		
		
		
//		
//		
//		System.out.println("Customer 2 Transaction");
//		
//		System.out.println("Enter the amount to be deposited:");
//		
//		depAmount = scn.nextFloat();
//        
//		currBal2 = c2.getAcc().deposit(depAmount);
//		
//		System.out.println("Your updated account balance is:" + currBal2);
//		
//		
//		System.out.println("Enter the amount to be withdrawn:");
//		withDrAmount = scn.nextFloat();
//		
//		currBal2 = c2.getAcc().withdraw(withDrAmount);
//		
//		System.out.println(currBal2 == -1 ? "Can't process transcation" : "Your updated account balance is:" + currBal2);
//		
//
//		System.out.println("Your details with Bank");
//		System.out.println(c2.toString());
//		
		
	}

}
