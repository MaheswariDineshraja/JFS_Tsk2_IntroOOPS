package com.oops;

public class Account {
	
	//data member
	private long id;
	private double balance;
	
	// no argument constructor
	public Account()
	{
		this.balance=0;
		System.out.println("");
	}
	
	
	// Two arguments constructor	
	public Account(long id, double balance)
	{
		this.id=id;
		if(balance >= 0)
		{
			this.balance=balance;
		}
		else
		{
		this.balance=0;
		}
	}
	
		
	//method to deposit the amount to the account
	public void deposit(double amount)
	{
		if(amount>0)
		{
			this.balance=this.balance+amount;
			System.out.println("deposit:"+amount);			
		}
		
	}
	
	//method to withdraw the amount from the account
	public void withdraw(double amount)
	{
		if(this.balance>amount)
		{
			this.balance=this.balance-amount;
			System.out.println("withdraw:"+amount);			
		}
		else {
			System.out.println("Insufficient balance!!");
		}
	}
	
	//method to return balance
	public double balancecheck()
	{
		return this.balance;
	}
	
	
	// Method to display the balance
    public void displayBalance() {
    	System.out.println("Updated Balance:"+this.balancecheck());
    }
	
    //Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account1=new Account();
		Account account2=new Account(1,10000);
				
	    account1.displayBalance();
	    account1.deposit(5000);
		account1.withdraw(2000);
		account1.displayBalance();
		System.out.println("\n");
		account2.displayBalance();
		account2.deposit(5000);
		account2.withdraw(2000);
		account2.displayBalance();


	}
	
	
	

}