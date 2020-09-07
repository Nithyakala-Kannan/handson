package com.hcl;

public class savingAccount extends Account
{

	protected double minimumBalance;
	savingAccount()
	{
		
	}
	public savingAccount(String accNumber,String accHolderName,double balance,double minimumBalance) {
		super();
		this.minimumBalance = minimumBalance;
	}
	
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
}
